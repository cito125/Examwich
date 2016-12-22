package com.example.andresarango.examwich;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.andresarango.examwich.model.ResponseWrapper;
import com.example.andresarango.examwich.network.AnimalsAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "AndresCanDoIt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null) {
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.activity_main, new AnimalsFragment())
                    .commit();
        }
    }

}
