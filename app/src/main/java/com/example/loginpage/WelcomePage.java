package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.MSG);
        TextView textView=findViewById(R.id.tView);
        textView.setText(message);
    }
    public void back(View view){
        Intent intent1= new Intent(this,MainActivity.class);
        Toast.makeText(this, "back to login page", Toast.LENGTH_SHORT).show();
        startActivity(intent1);
    }
}