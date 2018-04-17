package com.answersystem.lr.answersystem.com.answersystem.lr.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.answersystem.lr.answersystem.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        CircleImageView circleImageView=(CircleImageView) findViewById(R.id.image);
    }
}
