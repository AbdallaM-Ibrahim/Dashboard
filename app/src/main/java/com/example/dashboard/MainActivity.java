package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Bundle bundle;
    String name;
    static String email;
    TextView display_name;
    ImageView log_out;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();

        bundle = getIntent().getExtras();
        name = bundle.getString("name");
        email = bundle.getString("email");

        display_name = findViewById(R.id.display_name);
        display_name.setText(name);

        log_out = findViewById(R.id.log_out);
        log_out.setOnClickListener(view -> {
            new lastSignedDB(context).logOut();
            logOut();
        });
    }

    public void logOut(){
        finish();
        startActivity(new Intent(context,signIn.class));
    }
}