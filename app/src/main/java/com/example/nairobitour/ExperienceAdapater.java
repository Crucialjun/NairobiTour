package com.example.nairobitour;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ExperienceAdapater extends ArrayAdapter<Experience> {

    public ExperienceAdapater(Activity context, ArrayList<Experience> experiences){
        super(context,0,experiences);
    }

    @androidx.annotation.NonNull
    @NonNull
    @Override
    public View getView(int position, @androidx.annotation.Nullable @Nullable View convertView, @androidx.annotation.NonNull @NonNull ViewGroup parent) {

        View list

        return super.getView(position, convertView, parent);
    }
}
