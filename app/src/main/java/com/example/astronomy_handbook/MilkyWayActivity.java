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
        buttons.add(new Button("Созвездия", R.drawable.mercury));
        buttons.add(new Button("Туманности", R.drawable.venus));
        buttons.add(new Button("Объекты Мессье", R.drawable.earth));
        buttons.add(new Button("Млечный Путь", R.drawable.moon));
        buttons.add(new Button("Другие галактики", R.drawable.mars));
        buttons.add(new Button("Скопление галактик", R.drawable.jupiter));


        ButtonAdapter adapter = new ButtonAdapter(this, android.R.layout.activity_list_item, buttons);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
