package com.example.android.materialme;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {

    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etusername = findViewById(R.id.username);
        final EditText etpassword = findViewById(R.id.password);
        Button login = findViewById(R.id.login);
        final TextView daftar = findViewById(R.id.daftar);

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Daftar.class));
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String username = etusername.getText().toString();
                final String password = etpassword.getText().toString();

                if (username.equals("")){
                    etusername.setError("Username harus diisi!");
                    etusername.requestFocus();
                } else if (password.equals("")) {
                    etpassword.setError("Password harus diisi!");
                    etpassword.requestFocus();
                } else {
                    reference = FirebaseDatabase.getInstance().getReference().child("users").child(username);
                    reference.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            if (dataSnapshot.exists()) {
                                // ambil data password dari firebase
                                String passFirebase = dataSnapshot.child("password").getValue().toString();

                                //validasi password dengan password yang ada di firebase
                                if (password.equals(passFirebase)){
                                    Preferences.setRegisteredUser(getBaseContext(),username);
                                    Preferences.setLoggedInUser(getBaseContext(),Preferences.getRegisteredUser(getBaseContext()));
                                    Preferences.setLoggedInStatus(getBaseContext(),true);
                                    Intent intent = new Intent(Login.this, MainActivity.class);
                                    startActivity(intent);

                                } else {
                                    etpassword.setError("Password salah!");
                                    etpassword.requestFocus();
                                }
                            } else {
                                etusername.setError("Username ini belum terdaftar!");
                                etusername.requestFocus();
                            }

                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {
                            Toast.makeText(getApplicationContext(), "Database Error!", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

            }
        });


    }

    protected void onStart() {
        super.onStart();
        if (Preferences.getLoggedInStatus(getBaseContext())){
            startActivity(new Intent(getBaseContext(),MainActivity.class));
            finish();
        }
    }
}
