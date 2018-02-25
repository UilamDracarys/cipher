package com.masaya.cipher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TranspoActivity extends AppCompatActivity implements View.OnClickListener {


    //Declare elements/widgets
    EditText etInput;
    TextView tvOutput;
    Button btnEncrypt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transpo);

        etInput = findViewById(R.id.etInput);
        tvOutput = findViewById(R.id.tvOutput);
        btnEncrypt = findViewById(R.id.btnEncrypt);

        btnEncrypt.setOnClickListener(this);
    }

    private String encrypt(String str) {
        int strLen = str.length();
        String newString = "";
        String up = "";
        String down = "";
        for (int i=0;i<strLen;i++) {
            up += str.charAt(i);
            i += 1;
        }
        for (int i=1;i<strLen;i++) {
            down += str.charAt(i);
            i += 1;
        }
        newString = up+down;
        return newString;
    }

    @Override
    public void onClick(View v) {
        if (v == findViewById(R.id.btnEncrypt)) {
            tvOutput.setText(encrypt(etInput.getText().toString()).toUpperCase());
        }
    }
}
