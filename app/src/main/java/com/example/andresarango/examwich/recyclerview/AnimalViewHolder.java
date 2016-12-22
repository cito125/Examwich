package com.example.andresarango.examwich.recyclerview;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.andresarango.examwich.R;
import com.example.andresarango.examwich.model.Animal;

/**
 * Created by andresarango on 12/21/16.
 */
public class AnimalViewHolder extends RecyclerView.ViewHolder{

    TextView animalTV;

    public AnimalViewHolder(View itemView) {
        super(itemView);
        animalTV = (TextView) itemView.findViewById(R.id.animal_tv);

    }

    public void bind(Animal animal) {
        animalTV.setText(animal.getName());
        animalTV.setTextColor(Color.parseColor(animal.getTextColor()));
        itemView.setOnClickListener(onClick(animal));
    }

    private View.OnClickListener onClick(final Animal animal) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ViewGroup) itemView.getParent().getParent())
                        .setBackgroundColor(Color.parseColor(animal.getBackground()));

            }
        };
    }

}
