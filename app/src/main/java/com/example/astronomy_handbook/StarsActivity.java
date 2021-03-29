package com.example.astronomy_handbook;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class StarsActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_list);

        ArrayList<Button> buttons = new ArrayList<>();
        buttons.add(new Button("Цвет и яркость звезд", R.drawable.stars_color_and_brightness));
        buttons.add(new Button("Двойные звезды", R.drawable.double_stars));
        buttons.add(new Button("Переменные звезды", R.drawable.cepheids));
        buttons.add(new Button("Звезды-гиганты", R.drawable.star_giant));
        buttons.add(new Button("Белые карлики", R.drawable.white_dwarf));
        buttons.add(new Button("Пульсары", R.drawable.pulsar));
        buttons.add(new Button("Сверхновые", R.drawable.superstar));
        buttons.add(new Button("Черные дыры", R.drawable.blackhole_submenu));


        ButtonAdapter adapter = new ButtonAdapter(this, android.R.layout.activity_list_item, buttons, this.getClass().getSimpleName());
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
