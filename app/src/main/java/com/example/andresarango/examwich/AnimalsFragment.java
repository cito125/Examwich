package com.example.andresarango.examwich;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andresarango.examwich.model.ResponseWrapper;
import com.example.andresarango.examwich.network.AnimalsAPI;
import com.example.andresarango.examwich.recyclerview.AnimalsAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by andresarango on 12/21/16.
 */
public class AnimalsFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private final AnimalsAdapter mAdapter = new AnimalsAdapter();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.animals_fragment,container,false);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.animals_recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mRecyclerView.setAdapter(mAdapter);
        setAdapterList();
        return rootView;
    }

    private void setAdapterList() {
        AnimalsAPI.getInstance().getAnimalList().enqueue(new Callback<ResponseWrapper>() {
            @Override
            public void onResponse(Call<ResponseWrapper> call, Response<ResponseWrapper> response) {
                mAdapter.setAnimalList(response.body().getAnimals());
            }

            @Override
            public void onFailure(Call<ResponseWrapper> call, Throwable t) {

            }
        });

    }
}
