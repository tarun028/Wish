package com.example.javarefresher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void openActivity(View view){
        Toast.makeText(this, "Haan ho!!!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity2.class);

        startActivity(intent);
    }
}