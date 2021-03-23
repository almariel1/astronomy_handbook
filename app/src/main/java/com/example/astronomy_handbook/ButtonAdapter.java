package com.example.astronomy_handbook;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

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
    button1.setCompoundDrawablesWithIntrinsicBounds(0, 0, button.getImage(), 0);
/*    button1.setOnClickListener(view -> {
        Intent button_menuIntent = new Intent(getContext().this, ArticleActivity.class);
        startActivity(button_menuIntent);
    });*/

    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast toast = Toast.makeText(getContext(), "Welcome!", Toast.LENGTH_LONG);
            toast.show();
/*            View inflate = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_article, parent, false
            );*/
        }
    });

    return buttonItemView;
    }

    public void onClick() {
        Toast toast = Toast.makeText(getContext(), "Welcome!", Toast.LENGTH_LONG);
        toast.show();
    }


}
