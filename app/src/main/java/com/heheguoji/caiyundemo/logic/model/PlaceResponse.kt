package com.heheguoji.caiyundemo.logic.model

import com.google.gson.annotations.SerializedName

//TODO:去掉SerializedName注解跑一遍
data class PlaceResponse(val status:String,val places:List<Place>)
data class Place(val name:String, val location: Location,@SerializedName("formatted_address") val address:String )
data class Location(val lng:String,val lat :String)