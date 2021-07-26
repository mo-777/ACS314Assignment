package com.example.acs314assignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.acs314assignment.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

    }
    public void launchMainAct(View V){
        EditText Name = findViewById(R.id.edtTxtName);
        EditText PWord = findViewById(R.id.edtTxtPassword);

        String Uname = Name.getText().toString();
        String Pass = PWord.getText().toString();


        Intent i = new Intent(this, MainActivity2.class);

        if( Uname.equals("Seth") && Pass.equals("Pass") ){

            startActivity(i);
        }else {
            Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_LONG).show();
        }
    }
    public void launchSignUp(View V){

        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }
}