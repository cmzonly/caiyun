package com.heheguoji.caiyundemo.logic

import androidx.lifecycle.LiveData
import androidx.lifecycle.LiveDataScope
import androidx.lifecycle.liveData
import com.heheguoji.caiyundemo.logic.model.Place
import com.heheguoji.caiyundemo.logic.network.SunnyWeatherNetWork
import kotlinx.coroutines.Dispatchers
import java.lang.RuntimeException

object Repository {
    fun searchPlaces(query:String)= liveData(Dispatchers.IO) {
        val result=try {
            val placeResponse=SunnyWeatherNetWork.searchPlaces(query)
            if (placeResponse.status == "ok"){
                val places=placeResponse.places
                Result.success(places)
            }else{
                Result.failure(RuntimeException("请求状态失败"))
            }
        } catch (e: Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result)

    }
}