package com.example.tp1.viewmodels;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.example.tp1.activities.InfoUrlActivity;
import com.example.tp1.entities.Article;

import lombok.Data;

@Data
public class ArticleViewModel {
    private Article article;

    public void onClickUrl(View view) {
        Intent intent = new Intent(view.getContext(), InfoUrlActivity.class);
        intent.putExtra("data", article);
        view.getContext().startActivity(intent);
    }

    public void onClickToggle(View view) {
        article.setBought(!article.isBought());
        Toast.makeText(view.getContext(), String.format("Article %s is %s", article.getName(), article.isBought() ? "bought" : "not bought"), Toast.LENGTH_LONG).show();
    }
}
