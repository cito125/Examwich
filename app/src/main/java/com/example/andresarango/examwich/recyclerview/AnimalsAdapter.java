package com.example.andresarango.examwich.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.andresarango.examwich.R;
import com.example.andresarango.examwich.model.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andresarango on 12/21/16.
 */
public class AnimalsAdapter extends RecyclerView.Adapter<AnimalViewHolder>{
    List<Animal> mAnimalList = new ArrayList<>();

    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AnimalViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.animal_viewholder,parent,false)
        );
    }

    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {
        holder.bind(mAnimalList.get(position));
    }

    @Override
    public int getItemCount() {
        return mAnimalList.size();
    }

    public void setAnimalList(List<Animal> animalList) {
        mAnimalList.clear();
        mAnimalList.addAll(animalList);
        notifyDataSetChanged();
    }
}
