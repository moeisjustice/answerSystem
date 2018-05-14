package com.answersystem.lr.answersystem.com.answersystem.lr.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.answersystem.lr.answersystem.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class home extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        CircleImageView circleImageView= findViewById(R.id.image);
        Button person=(Button)this.findViewById(R.id.person);
        person.setOnClickListener(this);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.person:
                Intent intent=new Intent(home.this,personalInformation.class);
                startActivity(intent);
        }
    }
}
