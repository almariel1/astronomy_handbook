package com.example.astronomy_handbook;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class ButtonAdapter extends ArrayAdapter<Button> {

    private String mClassName;

    public ButtonAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Button> list_buttons, String className) {
        super(context, resource, list_buttons);
        mClassName = className;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public View getView(int position, @Nullable View convertView, ViewGroup parent) {
    View buttonItemView = convertView;

    if (buttonItemView == null) {
        buttonItemView = LayoutInflater.from(getContext()).inflate(
        R.layout.activity_submenu, parent, false
        );
    }

    Button button = getItem(position);

    android.widget.Button button1 = buttonItemView.findViewById(R.id.submenu_button);
    button1.setText(button.getText());
    button1.setCompoundDrawablesWithIntrinsicBounds(0, 0, button.getImage(), 0);

    button1.setOnClickListener(view -> {
        Intent button_menuIntent = new Intent(getContext(), ArticleActivity.class);
        button_menuIntent.putExtra("className", mClassName);
        button_menuIntent.putExtra("name", button.getText());
        button_menuIntent.putExtra("image", button.getImage());
        getContext().startActivity(button_menuIntent);
    });

    return buttonItemView;
    }



}
