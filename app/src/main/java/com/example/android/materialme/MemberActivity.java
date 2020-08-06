package com.example.android.materialme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MemberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);

        final EditText nama = findViewById(R.id.name_text);
        final EditText alamat = findViewById(R.id.address_text);
        final EditText telepon = findViewById(R.id.phone_text);
        final EditText klub = findViewById(R.id.note_text);
        Button tombol = findViewById(R.id.tombol);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String datanama = nama.getText().toString();
                String dataalamat = alamat.getText().toString();
                String datatelepon = telepon.getText().toString();
                String dataklub = klub.getText().toString();

                Intent intent = new Intent(MemberActivity.this, Output.class);
                intent.putExtra("exNama", datanama);
                intent.putExtra("exAlamat", dataalamat);
                intent.putExtra("exTelepon", datatelepon);
                intent.putExtra("exKlub", dataklub);
                startActivity(intent);

            }
        });

    }
}
