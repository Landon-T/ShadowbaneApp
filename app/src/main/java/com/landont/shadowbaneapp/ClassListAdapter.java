package com.landont.shadowbaneapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Owner on 1/2/2018.
 */

public class ClassListAdapter extends ArrayAdapter<CharacterClass> {

    private Activity context;
    private CharacterClass[] classes;

    public ClassListAdapter(Activity context, CharacterClass[] classes) {
        super(context, R.layout.class_view,classes);
        this.context = context;
        this.classes = classes;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.class_view, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.ClassName);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.ClassIcon);

        txtTitle.setText(classes[position].name);
        imageView.setImageResource(classes[position].Image);
        return rowView;

    };

}
