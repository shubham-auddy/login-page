package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public static final String MSG="com.example.loginpage.WelcomePage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void  submit(View view){


        EditText editText=findViewById(R.id.etUserName);
        EditText editText1=findViewById(R.id.etPassword);
        if(editText.getText().toString().equals("Sudip")&&editText1.getText().toString().equals("1234")){
        Toast.makeText(this, "go to Welcome page", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,WelcomePage.class);
        String message=editText.getText().toString()+"  WELCOME TO THE HARMAN ";
        intent.putExtra(MSG,message);
        startActivity(intent);
    }
        else{
            Toast.makeText(this, "Invalid Username or password", Toast.LENGTH_SHORT).show();
            Intent intent2=new Intent(this,MainActivity.class);
            startActivity(intent2);
        }
}
}