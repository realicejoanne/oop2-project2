package com.shofi.uascihuy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class ActivityOne extends AppCompatActivity {

    Button mengapa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        TextView txtInfo = (TextView)findViewById(R.id.txtInfo1);
        TextView textView1 = (TextView)findViewById(R.id.textView1);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        mengapa = (Button) findViewById(R.id.button1);


        mengapa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i = new Intent(ActivityOne.this, ActivityMengapa.class);
                    startActivity(i); //jalankan Intent

                }
            });


    }
}
