package com.masaya.cipher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CeasarActivity extends AppCompatActivity implements View.OnClickListener{

    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    //Declare elements/widgets
    EditText etInput;
    TextView tvOutput;
    Button btnEncrypt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceasar);

        //Initialize widgets
        etInput = findViewById(R.id.etInput);
        tvOutput = findViewById(R.id.tvCOutput);
        btnEncrypt = findViewById(R.id.btnEncrypt);

        //Set button click listener
        btnEncrypt.setOnClickListener(this);
    }

    private String encrypt(String str) {
        int strLen = str.length();
        String newString = "";
        String letter;
        for (int i=0; i<strLen; i++) {
            letter = String.valueOf(str.toUpperCase().charAt(i));
            int alphaIdx = alphabet.indexOf(letter);
            System.out.println("Index of " + letter );
            if (alphaIdx > 20) {
                alphaIdx -= 20;
            } else {
                alphaIdx += 5;
            }
            newString += alphabet.charAt(alphaIdx);
        }
        return newString;
    }

    @Override
    public void onClick(View v) {
        if (v == findViewById(R.id.btnEncrypt)) {
            tvOutput.setText(encrypt(etInput.getText().toString()));
        }
    }
}