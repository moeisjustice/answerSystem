package com.answersystem.lr.answersystem.com.answersystem.lr.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

import com.answersystem.lr.answersystem.R;
import com.bigkoo.pickerview.view.TimePickerView;

public class personalInformation extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_information);
        Button back=(Button) findViewById(R.id.back);
        back.setOnClickListener(this);

    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.back:
                finish();
        }
    }
}
