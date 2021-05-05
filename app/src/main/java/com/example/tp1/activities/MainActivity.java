package com.example.tp1.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.tp1.R;
import com.example.tp1.databinding.ActivityMainBinding;
import com.example.tp1.entities.Article;
import com.example.tp1.generated.callback.OnClickListener;
import com.example.tp1.viewmodels.ArticleViewModel;

public class MainActivity extends AppCompatActivity {

    private ArticleViewModel viewmodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewmodel = new ArticleViewModel();
        viewmodel.setArticle(new Article(
                1,
                "Pain au chocolat",
                "Une viennoiserie au beurre et au chocolat",
                1.0f,
                4,
                "http://datchocolate.com",
                false));
        binding.setViewmodel(viewmodel);
    }
}