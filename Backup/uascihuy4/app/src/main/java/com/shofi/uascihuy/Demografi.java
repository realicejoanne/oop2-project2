package com.shofi.uascihuy;

import java.io.Serializable;

public class Demografi implements Serializable {

    private String jk;
    private String usia;
    private String pendidikan;
    private String pekerjaan;
    private String key;

    public Demografi(){

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String nama) {
        this.jk = jk;
    }

    public String getUsia() {
        return usia;
    }

    public void setUsia(String merk) {
        this.usia = usia;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    @Override
    public String toString() {
        return " "+jk+"\n" +
                " "+usia +"\n" +
                " "+pendidikan +"\n" +
                " "+pekerjaan;
    }

    public Demografi(String jk, String usia, String pendidikan, String pekerjaan){
        jk = jk;
        usia = usia;
        pendidikan = pendidikan;
        pekerjaan = pekerjaan;
    }
}
