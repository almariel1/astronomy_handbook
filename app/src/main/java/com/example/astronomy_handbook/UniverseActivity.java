package com.example.astronomy_handbook;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class UniverseActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_list);

        ArrayList<Button> buttons = new ArrayList<>();
        buttons.add(new Button("Большой взрыв", R.drawable.mercury));
        buttons.add(new Button("Расширяющаяся Вселенная", R.drawable.venus));
        buttons.add(new Button("Реликтовое излучение", R.drawable.earth));
        buttons.add(new Button("Космическое излучение", R.drawable.moon));
        buttons.add(new Button("Гамма-всплески", R.drawable.mars));
        buttons.add(new Button("Квазары", R.drawable.jupiter));
        buttons.add(new Button("Темная материя", R.drawable.jupiter));
        buttons.add(new Button("Темная энергия", R.drawable.jupiter));


        ButtonAdapter adapter = new ButtonAdapter(this, android.R.layout.activity_list_item, buttons);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
