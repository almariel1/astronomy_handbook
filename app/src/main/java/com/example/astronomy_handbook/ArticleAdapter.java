package com.example.astronomy_handbook;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ArticleAdapter extends ArrayAdapter<Article> {

    public ArticleAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Article> article_components) {
        super(context, resource, article_components);
    }

    public View getView(int position, @Nullable View convertView, ViewGroup parent) {
        View articleItemView = convertView;

        if (articleItemView == null) {
            articleItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_article, parent, false
            );
        }

        Article article = getItem(position);

        TextView article1 = articleItemView.findViewById(R.id.article);
        article1.setMovementMethod(new ScrollingMovementMethod());
        article1.setText(article.getmArticle());

        android.widget.Button article_place = articleItemView.findViewById(R.id.article_place);
        article_place.setCompoundDrawablesWithIntrinsicBounds(0,0, article.getmArticleImage(), 0);


        return articleItemView;
    }
}
