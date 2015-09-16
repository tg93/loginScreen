package com.mycompany.loginscreen;

import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class LoginActivity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        android.support.v7.app.ActionBar bar = getSupportActionBar();
        if(bar != null) {
            bar.hide();
        }
        setContentView(R.layout.activity_login);
    }

    public void createAccount(View view) {
        //todo createAccount function
    }

    public void login(View view) {
        //todo login funciton
    }
}

