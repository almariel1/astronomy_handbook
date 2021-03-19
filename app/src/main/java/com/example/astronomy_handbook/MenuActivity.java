package com.example.astronomy_handbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class MenuActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageView planets = (ImageView) findViewById(R.id.image_planets);
        /*        TextView planets = findViewById(R.id.text_planets);*/
        planets.setOnClickListener(view -> {
            Intent planetsIntent = new Intent(MenuActivity.this, PlanetsActivity.class);
            startActivity(planetsIntent);
        });

        ImageView solar_system = findViewById(R.id.image_solar_system);
        solar_system.setOnClickListener(view -> {
            Intent solar_systemIntent = new Intent(MenuActivity.this, SolarSystemActivity.class);
            startActivity(solar_systemIntent);
        });

        ImageView stars = findViewById(R.id.image_stars);
        stars.setOnClickListener(view -> {
            Intent starsIntent = new Intent(MenuActivity.this, StarsActivity.class);
            startActivity(starsIntent);
        });

        ImageView milky_way = findViewById(R.id.image_milky_way);
        milky_way.setOnClickListener(view -> {
            Intent milky_wayIntent = new Intent(MenuActivity.this, MilkyWayActivity.class);
            startActivity(milky_wayIntent);
        });

        ImageView universe = findViewById(R.id.image_universe);
        universe.setOnClickListener(view -> {
            Intent universeIntent = new Intent(MenuActivity.this, UniverseActivity.class);
            startActivity(universeIntent);
        });

        ImageView space_time = findViewById(R.id.image_space_time);
        space_time.setOnClickListener(view -> {
            Intent space_timeIntent = new Intent(MenuActivity.this, SpaceTimeActivity.class);
            startActivity(space_timeIntent);
        });

    }
}
