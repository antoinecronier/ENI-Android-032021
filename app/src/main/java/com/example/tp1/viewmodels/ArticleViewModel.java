package com.example.tp1.viewmodels;

import android.view.View;
import android.widget.Toast;

import com.example.tp1.entities.Article;

import lombok.Data;

@Data
public class ArticleViewModel {
    private Article article;

    public void onClickUrl(View view){
        Toast.makeText(view.getContext(),  this.article.getUrl(), Toast.LENGTH_LONG).show();
    }
}
