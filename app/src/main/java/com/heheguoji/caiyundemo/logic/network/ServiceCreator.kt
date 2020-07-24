package com.heheguoji.caiyundemo.logic.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ServiceCreator {
    private const val BASE_URI="https://api.caiyunapp.com/"
    private val retrofit=Retrofit.Builder()
        .baseUrl(BASE_URI)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun <T> create(service: Class<T>):T= retrofit.create(service)


    /***
     * 泛型实化
     * 1.在没实化之前，都会在参数时使用T::class.java,使用后直接用T
     * 2.实化目的：解除泛型擦除机制（JVM只在编译时期对泛型识别，运行后无法识别）
     * 3.使用条件 ：必须内联，泛型必须加关键字reified
     */
    inline fun <reified T> create():T= create(T::class.java)
}