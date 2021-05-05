package com.example.tp1.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.tp1.R;
import com.example.tp1.databinding.ActivityInfoUrlBinding;
import com.example.tp1.databinding.ActivityMainBinding;
import com.example.tp1.entities.Article;
import com.example.tp1.viewmodels.ArticleViewModel;

public class InfoUrlActivity extends AppCompatActivity {

    private Article viewmodel = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityInfoUrlBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_info_url);
        if (this.getIntent().getExtras() != null && this.getIntent().getExtras().containsKey("data")) {
            viewmodel = (Article) this.getIntent().getSerializableExtra("data");
        }

        binding.setViewmodel(viewmodel);
    }
}