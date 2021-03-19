package com.example.astronomy_handbook;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class ButtonAdapter extends ArrayAdapter<Button> {

   /* private int mImageId;*/

    public ButtonAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Button> list_buttons) {
        super(context, resource, list_buttons);
    }


/*    public ButtonAdapter(@NonNull Context context, ArrayList<Button> listButtons) {
        super(context, listButtons);
    }*/

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
    button1.setId(button.getImage());
/*    button1.setOnClickListener(view -> {
        Intent button_menuIntent = new Intent(MenuActivity, ArticleActivity.class);
        startActivity(button_menuIntent);
    });*/
/*    Drawable image = getContext().getDrawable(R.drawable.mars);
    button1.setCompoundDrawables(null, null,image, null);*/


    return buttonItemView;
    }
}
