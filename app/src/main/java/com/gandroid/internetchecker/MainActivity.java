package com.gandroid.internetchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_check_for_internet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_check_for_internet = findViewById(R.id.btn_is_online);

        btn_check_for_internet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!InternetChecker.isOnline(MainActivity.this)){
                    Toast.makeText(MainActivity.this, "No internet connection", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Internet is active", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}