package com.example.idnplaboratorio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getSupportActionBar().hide();
    }

    public void submit(View view){
        Toast.makeText(getApplicationContext(), "Registro exitoso", Toast.LENGTH_LONG).show();
    }
}