package com.example.travisguo.myapplication;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.travisguo.myapplication.tools.MySharedPerference;


public class MainActivity extends AppCompatActivity{
    EditText account;
    EditText password;
    String text;
    String account_str;
    String passwd_str;
    Button register;
    Button login;

    boolean isFlag = false;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();


    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }
    private void initView(){

        account = findViewById(R.id.accountfillin);
        password = findViewById(R.id.passwdfillin);

        register = findViewById(R.id.register);
        login = findViewById(R.id.login);



//        register.setOnClickListener(this);
//        login.setOnClickListener(this);



    }


    public void registerButtonOnClick(android.view.View view){
        register();
    }

    private void register(){
        passwd_str = password.getText().toString();
        account_str =account.getText().toString();
        if (passwd_str.equalsIgnoreCase("")|| account_str.equalsIgnoreCase("")){
            Toast.makeText(this,"用户名或密码为空，请重新输入",Toast.LENGTH_SHORT).show();
        }else{
            SharedPreferences sharedpreferences = getSharedPreferences("userInfo", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putString("account",account_str);
            editor.putString("password",passwd_str);
            editor.commit();

            Toast.makeText(this,"注册成功！",Toast.LENGTH_SHORT).show();

        }
        isFlag = true;
    }

    public void loginButtonOnClick(android.view.View view){
        login();
    }

    private void login(){
        passwd_str = password.getText().toString();
        account_str =account.getText().toString();

        SharedPreferences sharedPreferences = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        if (passwd_str.equalsIgnoreCase("")|| account_str.equalsIgnoreCase("")){
            Toast.makeText(this, "用户名或密码为空，请重新输入", Toast.LENGTH_SHORT).show();
        }
        else {
            if (account_str.equals(sharedPreferences.getString("account", "0")) && sharedPreferences.contains("account")) {
                Log.w("test", passwd_str);
                if (passwd_str.equals(sharedPreferences.getString("password", "0")) && sharedPreferences.contains("password")) {
                    Intent intent = new Intent(MainActivity.this, SpashActivity.class);
                    intent.putExtra("account", account_str);
                    String _account = getIntent().getStringExtra("account");

                    Toast.makeText(this, "登陆成功！", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "密码错误！", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "查无此人！", Toast.LENGTH_SHORT).show();
            }
        }
    }



    public void onBackPressed(){
        Log.w("back", "backpress");
        Intent intent = new Intent();
        setResult(1000);
        super.onBackPressed();
    }

}
