package com.shofi.uascihuy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityYouarenotaloneiamherewithyou extends AppCompatActivity {


    Button buttonyna1, buttonyna2, buttonyna3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youarenotaloneiamherewithyou);

        buttonyna1 = (Button) findViewById(R.id.buttonyna1);
        buttonyna2 = (Button) findViewById(R.id.buttonyna2);
        buttonyna3 = (Button) findViewById(R.id.buttonyna3);

        buttonyna1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ActivityYouarenotaloneiamherewithyou.this, ActivityOne.class);
                startActivity(i); //jalankan Intent
            }
        });

        buttonyna2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ActivityYouarenotaloneiamherewithyou.this, ActivityYouarenotaloneiamherewithyou.class);
                startActivity(i); //jalankan Intent
            }
        });
    }

}