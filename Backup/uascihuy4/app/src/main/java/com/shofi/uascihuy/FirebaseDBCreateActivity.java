package com.shofi.uascihuy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseDBCreateActivity extends AppCompatActivity {

    private DatabaseReference database;

    // variable fields EditText dan Button
    private Button btSubmit;
    private EditText etJk;
    private EditText etUsia;
    private EditText etPendidikan;
    private EditText etPekerjaan;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db_create);

        etJk = (EditText) findViewById(R.id.et_jeniskelamin);
        etUsia = (EditText) findViewById(R.id.et_usia);
        etPendidikan = (EditText) findViewById(R.id.et_tingkatpendidikan);
        etPekerjaan = (EditText) findViewById(R.id.et_pekerjaan);
        btSubmit = (Button) findViewById(R.id.bt_submit);

        database = FirebaseDatabase.getInstance().getReference();

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isEmpty(etJk.getText().toString()) && !isEmpty(etUsia.getText().toString()) && !isEmpty(etPendidikan.getText().toString())&& !isEmpty(etPekerjaan.getText().toString()))
                    submitDemografi(new Demografi(etJk.getText().toString(), etUsia.getText().toString(), etPendidikan
                            .getText().toString(), etPekerjaan.getText().toString()));
                else
                    Snackbar.make(findViewById(R.id.bt_submit), "Data tidak boleh kosong", Snackbar.LENGTH_LONG).show();

                InputMethodManager imm = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(
                        etJk.getWindowToken(), 0);
            }
        });

    }

    private boolean isEmpty(String s) {
        return TextUtils.isEmpty(s);
    }

    private void submitDemografi(Demografi demografi) {

        database.child("demografi").push().setValue(demografi).addOnSuccessListener(this, new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                etJk.setText("");
                etUsia.setText("");
                etPendidikan.setText("");
                etPekerjaan.setText("");
                Snackbar.make(findViewById(R.id.bt_submit), "Data berhasil ditambahkan", Snackbar.LENGTH_LONG).show();
            }
        });
    }

    public static Intent getActIntent(Activity activity) {
        // kode untuk pengambilan Intent
        return new Intent(activity, FirebaseDBCreateActivity.class);
    }
}