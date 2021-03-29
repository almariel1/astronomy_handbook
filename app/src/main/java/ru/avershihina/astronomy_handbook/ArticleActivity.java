package ru.avershihina.astronomy_handbook;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ArticleActivity extends Activity {

    DatabaseHelper databaseHelper;
    SQLiteDatabase db;
    Cursor cursor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        Bundle components = getIntent().getExtras();

        android.widget.Button article_place = findViewById(R.id.article_place);
        article_place.setCompoundDrawablesWithIntrinsicBounds(0,0, components.getInt("image"), 0);
        article_place.setText(components.get("name").toString());

        databaseHelper = new DatabaseHelper(getApplicationContext());
        databaseHelper.create_db();
    }

    @Override
    public void onResume() {
        super.onResume();

        Bundle components = getIntent().getExtras();
        TextView article = findViewById(R.id.article);
        article.setMovementMethod(new ScrollingMovementMethod());
        // открываем подключение
        db = databaseHelper.open();

        //получаем данные из бд в виде курсора
        String[] columns = {DatabaseHelper.COLUMN_TEXT};
        String where_condition = DatabaseHelper.COLUMN_NAME + " = ?";
        String [] where_args = {components.get("name").toString()};

        String className = components.get("className").toString();

        cursor = db.query(
                getTable(className),
                columns,
                where_condition,
                where_args,
                null,
                null,
                null
        );

        cursor.moveToFirst();
        if (cursor.isBeforeFirst()) {
            article.setText("Статья не найдена");
        } else {
            article.setText(cursor.getString(0));
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // Закрываем подключение и курсор
        db.close();
        cursor.close();
    }

    private String getTable(String className) {

        String tableName;
        switch (className) {
            case "PlanetsActivity":
                tableName = DatabaseHelper.TABLE_PLANETS;
                break;
            case "SolarSystemActivity":
                tableName = DatabaseHelper.TABLE_SOLARSYSTEM;
                break;
            case "StarsActivity":
                tableName = DatabaseHelper.TABLE_STARS;
                break;
            case "MilkyWayActivity":
                tableName = DatabaseHelper.TABLE_MILKYWAY;
                break;
            case "UniverseActivity":
                tableName = DatabaseHelper.TABLE_UNIVERSE;
                break;
            case "SpaceTimeActivity":
                tableName = DatabaseHelper.TABLE_SPACETIME;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + className);
        }
        return tableName;
    }
}
