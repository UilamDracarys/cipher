package com.masaya.cipher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showCeasar(View view) {
        Intent intent = new Intent(this, CeasarActivity.class);
        startActivity(intent);
    }

    public void showTranspo(View view) {
        Intent intent = new Intent(this, TranspoActivity.class);
        startActivity(intent);
    }

    public void showPolyAlpha(View view) {
        Toast.makeText(this, "Ooops! This feature is not yet available. Come back soon.", Toast.LENGTH_SHORT).show();
    }


}
