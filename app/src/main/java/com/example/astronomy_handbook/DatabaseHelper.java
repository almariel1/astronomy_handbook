package com.example.astronomy_handbook;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static String DB_PATH;              // полный путь к базе данных
    private static String DB_NAME = "astronomy_handbook.db";
    private static final int SCHEMA = 1;        // версия базы данных

    // названия таблиц в бд
    static final String TABLE_PLANETS = "articles_planets";
    static final String TABLE_SOLARSYSTEM = "articles_solarSystem";
    static final String TABLE_STARS = "articles_stars";
    static final String TABLE_MILKYWAY = "articles_milkyWay";
    static final String TABLE_UNIVERSE = "articles_universe";
    static final String TABLE_SPACETIME = "articles_spaceTime";

    // названия столбцов
    static final String COLUMN_ID = "id";
    static final String COLUMN_NAME = "article_name";
    static final String COLUMN_TEXT = "article_text";

    private Context myContext;


    public DatabaseHelper(@Nullable Context context) {
        super(context, DB_NAME, null, SCHEMA);
        this.myContext = context;
        DB_PATH = context.getFilesDir().getPath() + DB_NAME;
    }

    @Override
    public void onCreate(SQLiteDatabase db) { }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,  int newVersion) { }

    void create_db(){

        InputStream myInput = null;
        OutputStream myOutput = null;
        try {
            File file = new File(DB_PATH);
            if (!file.exists()) {
                //получаем локальную бд как поток
                myInput = myContext.getAssets().open(DB_NAME);
                // Путь к новой бд
                String outFileName = DB_PATH;

                // Открываем пустую бд
                myOutput = new FileOutputStream(outFileName);

                // побайтово копируем данные
                byte[] buffer = new byte[1024];
                int length;
                while ((length = myInput.read(buffer)) > 0) {
                    myOutput.write(buffer, 0, length);
                }

                myOutput.flush();
            }
        }
        catch(IOException ex){
            Log.d("DatabaseHelper", ex.getMessage());
        }
        finally {
            try{
                if(myOutput!=null) myOutput.close();
                if(myInput!=null) myInput.close();
            }
            catch(IOException ex){
                Log.d("DatabaseHelper", ex.getMessage());
            }
        }
    }
    public SQLiteDatabase open()throws SQLException {

        return SQLiteDatabase.openDatabase(DB_PATH, null, SQLiteDatabase.OPEN_READWRITE);
    }
}

