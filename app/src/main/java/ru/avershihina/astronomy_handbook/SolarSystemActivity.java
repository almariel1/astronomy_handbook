package ru.avershihina.astronomy_handbook;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SolarSystemActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_list);

        ArrayList<Button> buttons = new ArrayList<>();
        buttons.add(new Button("Солнце", R.drawable.sun));
        buttons.add(new Button("Солнечный ветер", R.drawable.wind));
        buttons.add(new Button("Карликовые планеты", R.drawable.dwarf_planet));
        buttons.add(new Button("Астероиды", R.drawable.asteroid));
        buttons.add(new Button("Кометы", R.drawable.comet));
        buttons.add(new Button("Метеоры", R.drawable.meteor));


        ButtonAdapter adapter = new ButtonAdapter(this, android.R.layout.activity_list_item, buttons, this.getClass().getSimpleName());
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
