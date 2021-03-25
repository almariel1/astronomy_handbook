package com.example.astronomy_handbook;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.annotation.Nullable;

public class PlanetsActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_list);

        ArrayList<Button> buttons = new ArrayList<>();
        buttons.add(new Button("Меркурий", R.drawable.mercury));
        buttons.add(new Button("Венера", R.drawable.venus));
        buttons.add(new Button("Земля", R.drawable.earth));
        buttons.add(new Button("Луна", R.drawable.moon));
        buttons.add(new Button("Марс", R.drawable.mars));
        buttons.add(new Button("Юпитер", R.drawable.jupiter));
        buttons.add(new Button("Сатурн", R.drawable.saturn));
        buttons.add(new Button("Уран и Нептун", R.drawable.uranus_neptune));

        ArrayAdapter<Button> buts = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, buttons);

        ButtonAdapter adapter = new ButtonAdapter(this, android.R.layout.activity_list_item, buttons);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
