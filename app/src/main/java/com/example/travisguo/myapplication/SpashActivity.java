package com.example.travisguo.myapplication;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.util.Log;
import android.widget.Toast;


public class SpashActivity extends AppCompatActivity {

    TextView text1,text2,text3,text4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash);

        initView();

    }

    public void initView(){
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
    }

    public void OneOnClick(android.view.View view){
        Toast.makeText(this,"单击的项为One",Toast.LENGTH_SHORT).show();
    }
    public void TwoOnClick(android.view.View view){
        Toast.makeText(this,"单击的项为Two",Toast.LENGTH_SHORT).show();

    }
    public void ThreeOnClick(android.view.View view){
        Toast.makeText(this,"单击的项为Three",Toast.LENGTH_SHORT).show();

    }
    public void FourOnClick(android.view.View view){
        Toast.makeText(this,"单击的项为Four",Toast.LENGTH_SHORT).show();

    }





    protected void onActivityResult(int requestCode, int resultCode , @Nullable Intent data){
        if(requestCode == 1000){
            Log.w("回退","回退");
        }

    }


}
