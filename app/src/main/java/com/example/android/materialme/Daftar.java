package com.example.android.materialme;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Daftar extends AppCompatActivity {

    DatabaseReference reference;


    private static final String PRIMARY_CHANNEL_ID = "primary_notification_channel";

    private static final int NOTIFICATION_ID = 0;


    private NotificationManager mNotificationManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);


        final EditText etusername = findViewById(R.id.username);
        final EditText etpassword = findViewById(R.id.password);
        Button btnDaftar = findViewById(R.id.daftar);
        final TextView login = findViewById(R.id.kembalilogin);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etusername.getText().toString();
                String password  = etpassword.getText().toString();

                if (username.equals("")){
                    etusername.setError("Username harus diisi!");
                    etusername.requestFocus();
                }
                else if (password.equals("")){
                    etpassword.setError("Password harus diisi!");
                    etpassword.requestFocus();
                } else {
                    Preferences.setRegisteredUser(getBaseContext(),username);
                    // menyimpan data user ke firebase
                    reference = FirebaseDatabase.getInstance().getReference("users");

                    UserHelper usersHelper = new UserHelper(username, password);
                    reference.child(username).setValue(usersHelper);

                    sendNotification();
                    Intent gotologin = new Intent(Daftar.this, Login.class);
                    startActivity(gotologin);
                }


            }
        });


        createNotificationChannel();
    }


    //fungsi untuk mengirim notifikasi
    public void sendNotification() {
        NotificationCompat.Builder notifyBuilder = getNotificationBuilder();
        mNotificationManager.notify(NOTIFICATION_ID, notifyBuilder.build());
    }

    //fungsi untuk membuat notifikasi
    public void createNotificationChannel()
    {
        mNotificationManager = (NotificationManager)
                getSystemService(NOTIFICATION_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            // Create a NotificationChannel
            NotificationChannel notificationChannel = new NotificationChannel(PRIMARY_CHANNEL_ID,
                    "Mascot Notification", NotificationManager
                    .IMPORTANCE_HIGH);

            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(Color.RED);
            notificationChannel.enableVibration(true);
            notificationChannel.setDescription("Notification from Mascot");
            mNotificationManager.createNotificationChannel(notificationChannel);
        }
    }


    //fungsi untuk mengambil data notifikasi
    private NotificationCompat.Builder getNotificationBuilder(){
        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent notificationPendingIntent = PendingIntent.getActivity(this,
                NOTIFICATION_ID, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder notifyBuilder = new NotificationCompat.Builder(this, PRIMARY_CHANNEL_ID)
                .setContentTitle("Liga Indonesia")
                .setContentText("Akun Berhasil Dibuat.")
                .setContentIntent(notificationPendingIntent)
                .setAutoCancel(true)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .setSmallIcon(R.drawable.ic_android);
        return notifyBuilder;
    }
}
