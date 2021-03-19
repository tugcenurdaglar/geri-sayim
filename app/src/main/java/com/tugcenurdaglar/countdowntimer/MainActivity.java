package com.tugcenurdaglar.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button buttonBasla;
    private TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBasla = findViewById(R.id.buttonBasla);
        sonuc = findViewById(R.id.sonuc);

        buttonBasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(30000,1000){
                    @Override
                    public void onTick(long millisUntilFinished) { //her çalıştığında bir işlem yapacak

                        sonuc.setText("Kalan Süre : " +millisUntilFinished/1000+" sn");
                        // /1000 demezsen 30000 29000 diye geriye gider
                    }

                    @Override
                    public void onFinish() {
                        sonuc.setText("Bitti");

                    }
                }.start();

            }
        });
    }
}