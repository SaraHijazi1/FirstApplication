package com.example.myfirstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private TextView tvWelcome;
    @Override
    //this function create the activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvWelcome=findViewById(R.id.text1);

    }

    public void change_text(View view){
        tvWelcome.setText("this is my first app");
    }

    public void finishApp(View view){
        finish();
        System.exit(0);
    }
}