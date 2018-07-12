package br.com.rafaelsouza.testemovies.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {

    companion object {
         var BASE_URL = "https://api.themoviedb.org/3/"
    }


    private val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    fun noteService(): Service.MoviesService {
        return retrofit.create(Service.MoviesService::class.java)
    }
}