package com.example.intent;

import java.io.Serializable;

public class HocSinh implements Serializable {
    private String HoTen;
    private int NamSinh;

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }

    public HocSinh(String hoTen, int namSinh) {
        HoTen = hoTen;
        NamSinh = namSinh;
    }
}