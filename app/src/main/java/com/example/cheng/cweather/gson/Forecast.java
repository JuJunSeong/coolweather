package com.example.cheng.cweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Cheng on 2018/12/29.
 */
public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperatre;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
