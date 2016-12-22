package com.example.andresarango.examwich.network;

import com.example.andresarango.examwich.model.ResponseWrapper;

import retrofit2.Call;

/**
 * Created by andresarango on 12/21/16.
 */

public class AnimalsAPI {

    //http://jsjrobotics.nyc/cgi-bin/12_21_2016_exam.pl
    private final String BASE_URL = "http://jsjrobotics.nyc/";
    private static AnimalsAPI instance;
    private final AnimalService mAnimalService;

    private AnimalsAPI(){
        mAnimalService = (new NetworkServices()).getJSONService(BASE_URL,AnimalService.class);
    }


    public static AnimalsAPI getInstance() {
        if(instance == null){
            instance = new AnimalsAPI();
        }
        return instance;
    }


    public Call<ResponseWrapper> getAnimalList() {
        return mAnimalService.getAnimals();
    }
}
