package com.example.tomek.cookieclicker;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnCookie, btnReset;
    TextView txtCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCookie = (Button)findViewById(R.id.buttonCookie);
        btnReset = (Button)findViewById(R.id.buttonReset);
        txtCount = (TextView)findViewById(R.id.textCounter);

        btnCookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int amount = Integer.parseInt(txtCount.getText().toString());

                if(amount < 20) {
                    amount++;
                    txtCount.setText(String.valueOf(amount));
                } else if(amount >= 20 && amount < 100){
                    btnCookie.setText("COOKIE x5");
                    amount += 5;
                    txtCount.setText(String.valueOf(amount));
                } else if(amount >= 100 && amount < 300){
                    btnCookie.setText("COOKIE x10");
                        amount += 10;
                    txtCount.setText(String.valueOf(amount));
                } else if(amount >= 300 && amount < 1000){
                    btnCookie.setText("COOKIE x25");
                    amount += 25;
                    txtCount.setText(String.valueOf(amount));
                } else if(amount >= 1000){
                    btnCookie.setText("COOKIE x50");
                    amount += 50;
                    txtCount.setText(String.valueOf(amount));
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCount.setText(String.valueOf(0));
                btnCookie.setText("COOKIE");
            }
        });

    }
}
