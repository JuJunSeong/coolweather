package com.example.cheng.cweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Cheng on 2018/12/29.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
