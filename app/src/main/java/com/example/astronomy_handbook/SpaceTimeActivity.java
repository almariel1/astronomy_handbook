package com.example.astronomy_handbook;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SpaceTimeActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_list);

        ArrayList<Button> buttons = new ArrayList<>();
        buttons.add(new Button("Световые годы и парсеки", R.drawable.mercury));
        buttons.add(new Button("Эллипсы и орбиты", R.drawable.venus));
        buttons.add(new Button("Спектр света", R.drawable.earth));
        buttons.add(new Button("Гравитация", R.drawable.moon));
        buttons.add(new Button("Относительность", R.drawable.mars));
        buttons.add(new Button("Гравитационная линза", R.drawable.jupiter));
        buttons.add(new Button("Кротовые норы", R.drawable.jupiter));


        ButtonAdapter adapter = new ButtonAdapter(this, android.R.layout.activity_list_item, buttons);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
