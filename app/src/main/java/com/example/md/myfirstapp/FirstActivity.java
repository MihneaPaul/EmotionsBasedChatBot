package com.example.md.myfirstapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import net.bohush.geometricprogressview.GeometricProgressView;
import net.bohush.geometricprogressview.TYPE;

import static android.R.attr.animation;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        GeometricProgressView progressView = (GeometricProgressView) findViewById(R.id.progressView);
        progressView.setType(TYPE.TRIANGLE);
        progressView.setNumberOfAngles(12);
        progressView.setColor(Color.parseColor("#00897b"));
        progressView.setDuration(1000);
//        progressView.setFigurePadding(getResources().getDimensionPixelOffset(R.dimen.figure_padding));
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
