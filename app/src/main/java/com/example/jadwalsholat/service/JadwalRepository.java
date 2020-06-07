package com.example.jadwalsholat.service;

import com.example.jadwalsholat.model.jadwal.JadwalSholatResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JadwalRepository {
    @GET("v1/calendarByAddress?address=Yogyakarta&method=11&month=05&year=2020")
    Call<JadwalSholatResponse> getJadwalSholat();

}
