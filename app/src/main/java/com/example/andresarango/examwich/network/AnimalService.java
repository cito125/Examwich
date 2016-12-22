package com.example.andresarango.examwich.network;

import com.example.andresarango.examwich.model.ResponseWrapper;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by andresarango on 12/21/16.
 */
public interface AnimalService {
    //http://jsjrobotics.nyc/cgi-bin/12_21_2016_exam.pl
    @GET("cgi-bin/12_21_2016_exam.pl")
    Call<ResponseWrapper> getAnimals();

}
