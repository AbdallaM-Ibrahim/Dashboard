package com.example.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Settings extends AppCompatActivity {

    TextView user_name;
    ImageButton log_out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        user_name = findViewById(R.id.user_name);
        user_name.setText(MainActivity.name);

        log_out = findViewById(R.id.log_out);
        log_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new lastSignedDB(getApplicationContext()).logOut();
                logOut();
            }
        });
    }

    public void logOut(){
        MainActivity.theMain.finish();
        finish();
        startActivity(new Intent(getApplicationContext(),signIn.class));
    }
}