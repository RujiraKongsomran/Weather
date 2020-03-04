package com.rujirakongsomran.weather.Model;

public class Header {
    private String Title;
    private String Description;
    private String Uri;
    private String LastBuiltDate;
    private String CopyRight;
    private String Generator;

    public Header() {
    }

    public Header(String title, String description, String uri, String lastBuiltDate, String copyRight, String generator) {
        Title = title;
        Description = description;
        Uri = uri;
        LastBuiltDate = lastBuiltDate;
        CopyRight = copyRight;
        Generator = generator;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUri() {
        return Uri;
    }

    public void setUri(String uri) {
        Uri = uri;
    }

    public String getLastBuiltDate() {
        return LastBuiltDate;
    }

    public void setLastBuiltDate(String lastBuiltDate) {
        LastBuiltDate = lastBuiltDate;
    }

    public String getCopyRight() {
        return CopyRight;
    }

    public void setCopyRight(String copyRight) {
        CopyRight = copyRight;
    }

    public String getGenerator() {
        return Generator;
    }

    public void setGenerator(String generator) {
        Generator = generator;
    }
}
