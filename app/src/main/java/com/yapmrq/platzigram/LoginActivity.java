package com.yapmrq.platzigram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.yapmrq.platzigram.view.ContainerActivity;
import com.yapmrq.platzigram.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    void goCreateAccount(View view){
        Intent intent = new Intent(LoginActivity.this, CreateAccountActivity.class);
        startActivity(intent);
    }

    void goLogin(View view){
        Intent intent = new Intent(LoginActivity.this, ContainerActivity.class);
        startActivity(intent);
    }
}
