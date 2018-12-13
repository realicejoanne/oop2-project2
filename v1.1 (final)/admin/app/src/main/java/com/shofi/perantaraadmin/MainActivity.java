package com.shofi.perantaraadmin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.firebase.ui.database.FirebaseListOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class MainActivity extends AppCompatActivity{

    ListView listView;
    FirebaseListAdapter adapter;


    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.list_view);
        Query query = FirebaseDatabase.getInstance().getReferenceFromUrl("https://perantarafirebase.firebaseio.com/");
        FirebaseListOptions<Demografi> options = new FirebaseListOptions.Builder<Demografi>()
                .setLayout(R.layout.demografi)
                .setQuery(query, Demografi.class)
                .build();

        adapter = new FirebaseListAdapter(options) {
            @Override
            protected void populateView(View v, Object model, int position) {
                TextView number = v.findViewById(R.id.number);
                TextView email = v.findViewById(R.id.email_text_view);
                TextView jk = v.findViewById(R.id.jk_text_view);
                TextView pekerjaan = v.findViewById(R.id.pekerjaan_text_view);
                TextView pendidikan = v.findViewById(R.id.pendidikan_text_view);
                TextView umur = v.findViewById(R.id.umur_text_view);

                Demografi demografi = (Demografi) model;
                number.setText("Data ke-" + (position + 1));
                email.setText(demografi.getEmail().toString());
                jk.setText(demografi.getJk().toString());
                pekerjaan.setText(demografi.getPekerjaan().toString());
                pendidikan.setText(demografi.getPendidikan().toString());
                umur.setText(demografi.getUmur().toString());
            }
        };

        listView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}