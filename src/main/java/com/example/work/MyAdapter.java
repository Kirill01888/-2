package com.example.work;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends ArrayAdapter<Students> {

    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Students> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final Students st = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_student, null);
        }

        TextView name = convertView.findViewById(R.id.item_name);
        TextView group = convertView.findViewById(R.id.item_group);
        TextView age = convertView.findViewById(R.id.item_age);
        TextView score = convertView.findViewById(R.id.item_score);

        name.setText(st.name);
        group.setText(st.group);
        age.setText(String.valueOf(st.age));
        score.setText(String.valueOf(st.score));

            return convertView;
    }
}