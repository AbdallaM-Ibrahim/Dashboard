package com.example.dashboard;
// 2022/12/15  9:55

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Intent GpaCalculator;
    Bundle bundle;
    String name;
    static String email;
    TextView display_name;
    ImageView log_out;
    ImageView listbut;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();

        GpaCalculator = new Intent(this, Gpa_Calculator.class);
        bundle = getIntent().getExtras();
        name = bundle.getString("name");
        email = bundle.getString("email");

        display_name = findViewById(R.id.display_name);
        display_name.setText(name);

        log_out = findViewById(R.id.log_out);
        log_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new lastSignedDB(context).logOut();
                logOut();
            }
        });

        listbut=findViewById(R.id.listbut);
        listbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,list.class);
                startActivity(intent);
            }
        });

    }

    public void logOut(){
        finish();
        startActivity(new Intent(context,signIn.class));
    }

    public void GoToCalculator(View view){
        startActivity(GpaCalculator);
    }


}