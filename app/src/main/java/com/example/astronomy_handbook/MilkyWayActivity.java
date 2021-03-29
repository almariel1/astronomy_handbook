package com.example.astronomy_handbook;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MilkyWayActivity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_list);

        ArrayList<Button> buttons = new ArrayList<>();
        buttons.add(new Button("Созвездия", R.drawable.constellations));
        buttons.add(new Button("Туманности", R.drawable.nebulas));
        buttons.add(new Button("Объекты Мессье", R.drawable.messier));
        buttons.add(new Button("Млечный Путь", R.drawable.milkyway_submenu));
        buttons.add(new Button("Другие галактики", R.drawable.other_galaxies));
        buttons.add(new Button("Скопление галактик", R.drawable.many_galaxies));


        ButtonAdapter adapter = new ButtonAdapter(this, android.R.layout.activity_list_item, buttons, this.getClass().getSimpleName());
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
