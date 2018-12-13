package com.shofi.perantaraadmin;

public class Demografi{

    private String email;
    private String jk;
    private String pekerjaan;
    private String pendidikan;
    private Long umur;

    public Demografi() {

    }

    public Demografi(String email, String jk, String pekerjaan, String pendidikan, Long umur) {
        this.email = email;
        this.jk = jk;
        this.pekerjaan = pekerjaan;
        this.pendidikan = pendidikan;
        this.umur = umur;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public Long getUmur() {
        return umur;
    }

    public void setUmur(Long umur) {
        this.umur = umur;
    }
}