package com.shofi.uascihuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;

public class ActivityMengapa extends AppCompatActivity {

    Button salira;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mengapa);

        TextView txtInfo = (android.widget.TextView)findViewById(R.id.txtInfo2);
        TextView textView1 = (android.widget.TextView)findViewById(R.id.textView2);
        ImageView imageView1 = (android.widget.ImageView) findViewById(R.id.imageView2);

        salira = (Button) findViewById(R.id.button2);

        salira.setOnClickListener(new android.view.View.OnClickListener() {
                @Override
                public void onClick(android.view.View view) {

                    android.content.Intent i = new android.content.Intent(ActivityMengapa.this, ActivitySalira.class);
                    startActivity(i); //jalankan Intent

                }
            });
    }
}
