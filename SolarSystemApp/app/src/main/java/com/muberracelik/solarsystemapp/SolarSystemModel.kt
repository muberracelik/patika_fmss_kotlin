package com.muberracelik.solarsystemapp
import com.squareup.moshi.Json

data class SolarSystemModel(

    @Json (name = "img_src")
    val img_src : String,

    @Json (name = "price")
    val price : Int,

    @Json (name = "id")
    val id : String,

    @Json (name = "type")
    val type : String
)
