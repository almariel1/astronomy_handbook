package ru.avershihina.astronomy_handbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Экран-заставка "загрузки" приложения с задержкой в 3 секунды
        Thread splash_time = new Thread() {
            public void run() {
                try {
                    int splashTimer =1000;
                    while (splashTimer > 0) {
                        sleep(100);
                        splashTimer = splashTimer - 100;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    finish();
                    startActivity(new Intent(MainActivity.this, MenuActivity.class));
                }
            }
        };
        splash_time.start();


    }
}