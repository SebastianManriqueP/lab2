package com.example.lab2_20186098_20190740;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageButton imageButton = findViewById(R.id.imageView);

        imageButton.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity3.this, detalleEvento.class));
        });

        ImageButton imagenBtn = findViewById(R.id.imageViewBtn2);
        imagenBtn.setOnClickListener(view -> {
            onBackPressed();
        });
    }
}