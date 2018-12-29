package com.example.cheng.cweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Cheng on 2018/12/29.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
