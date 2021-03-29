package ru.avershihina.astronomy_handbook;

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
        buttons.add(new Button("Большой взрыв", R.drawable.bigbang));
        buttons.add(new Button("Расширяющаяся Вселенная", R.drawable.expanding_universe));
        buttons.add(new Button("Реликтовое излучение", R.drawable.relict_radiation));
        buttons.add(new Button("Космическое излучение", R.drawable.cosmical_radiation));
        buttons.add(new Button("Гамма-всплески", R.drawable.gamma_ray_burst));
        buttons.add(new Button("Квазары", R.drawable.quasar));
        buttons.add(new Button("Темная материя", R.drawable.black_matter));
        buttons.add(new Button("Темная энергия", R.drawable.energy));


        ButtonAdapter adapter = new ButtonAdapter(this, android.R.layout.activity_list_item, buttons, this.getClass().getSimpleName());
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
