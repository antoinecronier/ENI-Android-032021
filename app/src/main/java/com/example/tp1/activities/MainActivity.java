package com.example.tp1.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.TextView;

import com.example.tp1.R;
import com.example.tp1.databinding.ActivityMainBinding;
import com.example.tp1.entities.Article;
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
                "http://datchocolate.com"));
        binding.setViewmodel(viewmodel);

        //setContentView(R.layout.activity_main);
//
//        TextView txtVName = this.findViewById(R.id.mainactivity_item_name);
//        txtVName.setText(viewmodel.getName());
//        this.findViewById(R.id.mainactivity_item_info);
//        this.findViewById(R.id.mainactivity_item_price);
//        this.findViewById(R.id.mainactivity_item_ratting);
//        this.findViewById(R.id.mainactivity_imgbtn);
//        this.findViewById(R.id.mainactivity_toggle);
    }
}