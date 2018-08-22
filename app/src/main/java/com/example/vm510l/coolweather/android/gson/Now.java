package com.example.vm510l.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by VM510L on 2018/8/20.
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
