package com.example.android.materialme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Output extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        TextView nama=findViewById(R.id.hasilnama);
        TextView alamat=findViewById(R.id.hasilalamat);
        TextView telepon=findViewById(R.id.hasiltelepon);
        TextView klub=findViewById(R.id.hasilklub);
        Button tombol = findViewById(R.id.tombol);


        nama.setText(getIntent().getStringExtra("exNama"));
        alamat.setText(getIntent().getStringExtra("exAlamat"));
        telepon.setText(getIntent().getStringExtra("exTelepon"));
        klub.setText(getIntent().getStringExtra("exKlub"));

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Output.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }
}
