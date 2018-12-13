package com.shofi.uascihuy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.LinearLayout;

public class ActivityYouarenotaloneimherewithyou extends AppCompatActivity {

    LinearLayout youarenotaloneline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youarenotaloneimherewithyou);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        youarenotaloneline = (LinearLayout) findViewById(R.id.youarenotalonelinear);

    }
}
