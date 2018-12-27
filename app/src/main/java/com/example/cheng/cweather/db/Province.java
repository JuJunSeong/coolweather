package com.example.cheng.cweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Cheng on 2018/12/27.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    private int provinceCode;

}
