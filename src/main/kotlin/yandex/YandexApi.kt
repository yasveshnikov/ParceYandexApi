package yandex

import models.Ymaps
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface YandexApi {

    @GET("/1.x/")
    fun getNearStations(@Query("apikey") authKey: String, @Query("geocode") lat: String): Call<Ymaps>
}