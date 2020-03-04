package com.rujirakongsomran.weather;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.rujirakongsomran.weather.Adapter.WeatherAdapter;
import com.rujirakongsomran.weather.Model.RootObject;
import com.rujirakongsomran.weather.Model.Weather;

import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RequestQueue mQueue;
    Button btnCallService;
    TextView tvResponse;
    RecyclerView recycler_posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstances();
    }

    private void initInstances() {
//        btnCallService = (Button) findViewById(R.id.btnCallService);
//        btnCallService.setOnClickListener(btnCallServiceListener);
//        tvResponse = (TextView) findViewById(R.id.tvResponse);

        mQueue = Volley.newRequestQueue(this);

        // View
        recycler_posts = (RecyclerView) findViewById(R.id.recycler_posts);
        recycler_posts.setHasFixedSize(true);
        recycler_posts.setLayoutManager(new LinearLayoutManager(this));

        jsonParse();
    }

//    View.OnClickListener btnCallServiceListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            if (view == btnCallService) {
//                jsonParse();
//            }
//        }
//    };

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

                        WeatherAdapter adapter = new WeatherAdapter(MainActivity.this, weatherArrayList);
                        recycler_posts.setAdapter(adapter);

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
