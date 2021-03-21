package com.example.retrofit_uygulama;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mesaj {

    @SerializedName("message")
    @Expose
    private String mesaj;
    @SerializedName("soy_isim")
    @Expose
    private String soy_isim;
;


    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }


    public String getSoy_isim() {
        return soy_isim;
    }

    public void setSoy_isim(String mesaj) {
        this.soy_isim = soy_isim;
    }

}