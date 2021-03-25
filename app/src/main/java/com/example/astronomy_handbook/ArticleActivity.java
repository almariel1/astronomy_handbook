package com.example.astronomy_handbook;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.Scroller;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ArticleActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        TextView article = findViewById(R.id.article);
        article.setMovementMethod(new ScrollingMovementMethod());


    }
}
