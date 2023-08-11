package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName


// 这个是用于存放地址https://api.caiyunapp.com/v2/place?query=%E5%8C%97%E4%BA%AC&token=yeGRsTWjH02wE7DM&lang=zh_CN
// %E5%8C%97%E4%BA%AC表示的是地点的名称，放在网页中时需要写中文
// token=yeGRsTWjH02wE7DM表示的是
data class PlaceResponse(val status: String, val places: List<Place>)

// @SerializedName注解的方式，来让JSON字段和Kotlin字段之间建立映射关系
data class Place(val name: String, val location: Location,
                 @SerializedName("formatted_address") val address: String)

data class Location(val lng: String, val lat: String)