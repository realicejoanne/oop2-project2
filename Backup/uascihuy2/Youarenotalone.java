package com.shofi.uascihuy;

import android.os.Parcel;
import android.os.Parcelable;

public class Youarenotalone implements Parcelable {

    String nama;
    String lokasi;
    String telepon;
    String website;

    public Youarenotalone(String nama, String lokasi, String telepon, String website) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.telepon = telepon;
        this.website = website;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.lokasi);
        dest.writeString(this.telepon);
        dest.writeString(this.website);
    }

    protected Youarenotalone(Parcel in) {
        this.nama = in.readString();
        this.lokasi = in.readString();
        this.telepon = in.readString();
        this.website = in.readString();
    }

    public static final Parcelable.Creator<Youarenotalone> CREATOR = new Parcelable.Creator<Youarenotalone>() {
        @Override
        public Youarenotalone createFromParcel(Parcel source) {
            return new Youarenotalone(source);
        }

        @Override
        public Youarenotalone[] newArray(int size) {
            return new Youarenotalone[size];
        }
    };
}
