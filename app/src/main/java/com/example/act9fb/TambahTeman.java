package com.example.act9fb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;

public class TambahTeman extends AppCompatActivity {
    private EditText edNama, edTelpon;
    private Button submitBtn;
    private DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_teman);

        edNama = findViewById(R.id.editNama);
        edTelpon = findViewById(R.id.editTelpon);
        submitBtn = findViewById(R.id.btnOk);

    }
}