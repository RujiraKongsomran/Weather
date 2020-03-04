package com.rujirakongsomran.weather;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.rujirakongsomran.weather.Model.RootObject;
import com.rujirakongsomran.weather.Model.Weather;

import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RequestQueue mQueue;
    Button btnCallService;
    TextView tvResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstances();
    }

    private void initInstances() {
        btnCallService = (Button) findViewById(R.id.btnCallService);
        btnCallService.setOnClickListener(btnCallServiceListener);
        tvResponse = (TextView) findViewById(R.id.tvResponse);

        mQueue = Volley.newRequestQueue(this);


//        String json = "{\n" +
//                "  \"Header\": {\n" +
//                "    \"Title\": \"WeatherToday\",\n" +
//                "    \"Description\": \"Today's Weather Observation\",\n" +
//                "    \"Uri\": \"https://data.tmd.go.th/api/WeatherToday/V1\",\n" +
//                "    \"LastBuiltDate\": \"4/3/2020 16:52:21\",\n" +
//                "    \"CopyRight\": \"Thai Meteorology Department 2015\",\n" +
//                "    \"Generator\": \"TMDData_API services\"\n" +
//                "  },\n" +
//                "  \"Stations\": [\n" +
//                "    {\n" +
//                "      \"WmoNumber\": \"48300\",\n" +
//                "      \"StationNameTh\": \"แม่ฮ่องสอน\",\n" +
//                "      \"StationNameEng\": \"MAE HONG SON\",\n" +
//                "      \"Province\": \"แม่ฮ่องสอน\",\n" +
//                "      \"Latitude\": {\n" +
//                "        \"Value\": \"19.298972222222222222222222222\",\n" +
//                "        \"Unit\": \"decimal degree\"\n" +
//                "      },\n" +
//                "      \"Longitude\": {\n" +
//                "        \"Value\": \"97.97577777777777777777777778\",\n" +
//                "        \"Unit\": \"decimal degree\"\n" +
//                "      },\n" +
//                "      \"Observe\": {\n" +
//                "        \"Time\": \"4/3/2020\",\n" +
//                "        \"MeanSeaLevelPressure\": {\n" +
//                "          \"Value\": 1012.61,\n" +
//                "          \"Unit\": \"hPa\"\n" +
//                "        },\n" +
//                "        \"Temperature\": {\n" +
//                "          \"Value\": 18.8,\n" +
//                "          \"Unit\": \"celcius\"\n" +
//                "        },\n" +
//                "        \"MaxTemperature\": {\n" +
//                "          \"Value\": 35.3,\n" +
//                "          \"Unit\": \"celcius\"\n" +
//                "        },\n" +
//                "        \"DiffMaxTemperature\": {\n" +
//                "          \"Value\": -0.6,\n" +
//                "          \"Unit\": \"celcius\"\n" +
//                "        },\n" +
//                "        \"MinTemperature\": {\n" +
//                "          \"Value\": 18.4,\n" +
//                "          \"Unit\": \"celcius\"\n" +
//                "        },\n" +
//                "        \"DiffMinTemperature\": {\n" +
//                "          \"Value\": 2.3,\n" +
//                "          \"Unit\": \"hPa\"\n" +
//                "        },\n" +
//                "        \"RelativeHumidity\": {\n" +
//                "          \"Value\": 90.0,\n" +
//                "          \"Unit\": \"%\"\n" +
//                "        },\n" +
//                "        \"WindDirection\": {\n" +
//                "          \"Value\": \"000\",\n" +
//                "          \"Unit\": \"degree\"\n" +
//                "        },\n" +
//                "        \"WindSpeed\": {\n" +
//                "          \"Value\": 0.0,\n" +
//                "          \"Unit\": \"km/h\"\n" +
//                "        },\n" +
//                "        \"Rainfall\": {\n" +
//                "          \"Value\": 0.1,\n" +
//                "          \"Unit\": \"mm\"\n" +
//                "        }\n" +
//                "      }\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"WmoNumber\": \"48325\",\n" +
//                "      \"StationNameTh\": \"แม่สะเรียง\",\n" +
//                "      \"StationNameEng\": \"MAE SARIANG\",\n" +
//                "      \"Province\": \"แม่ฮ่องสอน\",\n" +
//                "      \"Latitude\": {\n" +
//                "        \"Value\": \"18.166666666666666666666666667\",\n" +
//                "        \"Unit\": \"decimal degree\"\n" +
//                "      },\n" +
//                "      \"Longitude\": {\n" +
//                "        \"Value\": \"97.93333333333333333333333333\",\n" +
//                "        \"Unit\": \"decimal degree\"\n" +
//                "      },\n" +
//                "      \"Observe\": {\n" +
//                "        \"Time\": \"4/3/2020\",\n" +
//                "        \"MeanSeaLevelPressure\": {\n" +
//                "          \"Value\": 1012.59,\n" +
//                "          \"Unit\": \"hPa\"\n" +
//                "        },\n" +
//                "        \"Temperature\": {\n" +
//                "          \"Value\": 19.5,\n" +
//                "          \"Unit\": \"celcius\"\n" +
//                "        },\n" +
//                "        \"MaxTemperature\": {\n" +
//                "          \"Value\": 35.5,\n" +
//                "          \"Unit\": \"celcius\"\n" +
//                "        },\n" +
//                "        \"DiffMaxTemperature\": {\n" +
//                "          \"Value\": -1.5,\n" +
//                "          \"Unit\": \"celcius\"\n" +
//                "        },\n" +
//                "        \"MinTemperature\": {\n" +
//                "          \"Value\": 18.9,\n" +
//                "          \"Unit\": \"celcius\"\n" +
//                "        },\n" +
//                "        \"DiffMinTemperature\": {\n" +
//                "          \"Value\": 2.7,\n" +
//                "          \"Unit\": \"hPa\"\n" +
//                "        },\n" +
//                "        \"RelativeHumidity\": {\n" +
//                "          \"Value\": 90.0,\n" +
//                "          \"Unit\": \"%\"\n" +
//                "        },\n" +
//                "        \"WindDirection\": {\n" +
//                "          \"Value\": \"000\",\n" +
//                "          \"Unit\": \"degree\"\n" +
//                "        },\n" +
//                "        \"WindSpeed\": {\n" +
//                "          \"Value\": 0.0,\n" +
//                "          \"Unit\": \"km/h\"\n" +
//                "        },\n" +
//                "        \"Rainfall\": {\n" +
//                "          \"Value\": 0.0,\n" +
//                "          \"Unit\": \"mm\"\n" +
//                "        }\n" +
//                "      }\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"WmoNumber\": \"48303\",\n" +
//                "      \"StationNameTh\": \"เชียงราย\",\n" +
//                "      \"StationNameEng\": \"CHIANG RAI\",\n" +
//                "      \"Province\": \"เชียงราย\",\n" +
//                "      \"Latitude\": {\n" +
//                "        \"Value\": \"19.961388888888888888888888889\",\n" +
//                "        \"Unit\": \"decimal degree\"\n" +
//                "      },\n" +
//                "      \"Longitude\": {\n" +
//                "        \"Value\": \"99.88138888888888888888888889\",\n" +
//                "        \"Unit\": \"decimal degree\"\n" +
//                "      },\n" +
//                "      \"Observe\": {\n" +
//                "        \"Time\": \"4/3/2020\",\n" +
//                "        \"MeanSeaLevelPressure\": {\n" +
//                "          \"Value\": 1012.36,\n" +
//                "          \"Unit\": \"hPa\"\n" +
//                "        },\n" +
//                "        \"Temperature\": {\n" +
//                "          \"Value\": 18.0,\n" +
//                "          \"Unit\": \"celcius\"\n" +
//                "        },\n" +
//                "        \"MaxTemperature\": {\n" +
//                "          \"Value\": 34.4,\n" +
//                "          \"Unit\": \"celcius\"\n" +
//                "        },\n" +
//                "        \"DiffMaxTemperature\": {\n" +
//                "          \"Value\": -0.2,\n" +
//                "          \"Unit\": \"celcius\"\n" +
//                "        },\n" +
//                "        \"MinTemperature\": {\n" +
//                "          \"Value\": 17.4,\n" +
//                "          \"Unit\": \"celcius\"\n" +
//                "        },\n" +
//                "        \"DiffMinTemperature\": {\n" +
//                "          \"Value\": 0.9,\n" +
//                "          \"Unit\": \"hPa\"\n" +
//                "        },\n" +
//                "        \"RelativeHumidity\": {\n" +
//                "          \"Value\": 86.0,\n" +
//                "          \"Unit\": \"%\"\n" +
//                "        },\n" +
//                "        \"WindDirection\": {\n" +
//                "          \"Value\": \"000\",\n" +
//                "          \"Unit\": \"degree\"\n" +
//                "        },\n" +
//                "        \"WindSpeed\": {\n" +
//                "          \"Value\": 0.0,\n" +
//                "          \"Unit\": \"km/h\"\n" +
//                "        },\n" +
//                "        \"Rainfall\": {\n" +
//                "          \"Value\": 0.0,\n" +
//                "          \"Unit\": \"mm\"\n" +
//                "        }\n" +
//                "      }\n" +
//                "    }\n" +
//                "  ]\n" +
//                "}";
//        RootObject rootObject = gson.fromJson(json, RootObject.class);

    }

    View.OnClickListener btnCallServiceListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view == btnCallService) {
                jsonParse();
            }
        }
    };

    private void jsonParse() {
        String url = "https://data.tmd.go.th/api/WeatherToday/V1/?type=json";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        ArrayList<Weather> weatherArrayList = new ArrayList<>();
                        Gson gson = new Gson();

                        RootObject rootObject = gson.fromJson(response.toString(), RootObject.class);
                        for (int i = 0; i < rootObject.getStations().size(); i++) {
                            Weather weather = new Weather();
                            weather.setStationNameEng(rootObject.getStations().get(i).getStationNameEng());
                            weather.setTemperatureValue(rootObject.getStations().get(i).getObserve().getTemperature().getValue());
                            weatherArrayList.add(weather);
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        request.setRetryPolicy(new DefaultRetryPolicy(
                500000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        mQueue.add(request);
    }

}
