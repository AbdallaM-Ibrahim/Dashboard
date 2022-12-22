package com.example.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class EditSubjects extends AppCompatActivity {
    private Toolbar toolbar;
    private String[] days = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday"};
    private EditText edtsubj1,edtsubj2,edtsubj3,edtsubj4,edtsubj5;
    private Button btnSave;
    public static String editDay;
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_subjects);
        setupViews();
        initToolbar();
        autoCompleteTextView = findViewById(R.id.selecday);
        adapterItems = new ArrayAdapter<String>(this, R.layout.list_items,days);
        autoCompleteTextView.setAdapter(adapterItems);
        editDay = "Saturday";
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                editDay= adapterItems.getItem(i);
            }
        });
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editDay.equalsIgnoreCase("Thursday")) {
                    if(!edtsubj1.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Thur1", edtsubj1.getText().toString()).apply();
                    }
                    if(!edtsubj2.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Thur2", edtsubj2.getText().toString()).apply();
                    }
                    if(!edtsubj3.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Thur3", edtsubj3.getText().toString()).apply();
                    }
                    if(!edtsubj4.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Thur4", edtsubj4.getText().toString()).apply();
                    }
                    if(!edtsubj5.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Thur5", edtsubj5.getText().toString()).apply();
                    }
                    finish();
                }else if(editDay.equalsIgnoreCase("Sunday")) {
                    if(!edtsubj1.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Sun1", edtsubj1.getText().toString()).apply();
                    }
                    if(!edtsubj2.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Sun2", edtsubj2.getText().toString()).apply();
                    }
                    if(!edtsubj3.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Sun3", edtsubj3.getText().toString()).apply();
                    }
                    if(!edtsubj4.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Sun4", edtsubj4.getText().toString()).apply();
                    }
                    if(!edtsubj5.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Sun5", edtsubj5.getText().toString()).apply();
                    }
                    finish();
                } else if(editDay.equalsIgnoreCase("Monday")) {
                    if(!edtsubj1.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Mon1", edtsubj1.getText().toString()).apply();
                    }
                    if(!edtsubj2.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Mon2", edtsubj2.getText().toString()).apply();
                    }
                    if(!edtsubj3.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Mon3", edtsubj3.getText().toString()).apply();
                    }
                    if(!edtsubj4.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Mon4", edtsubj4.getText().toString()).apply();
                    }
                    if(!edtsubj5.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Mon5", edtsubj5.getText().toString()).apply();
                    }
                    finish();
                }else if(editDay.equalsIgnoreCase("Tuesday")) {
                    if(!edtsubj1.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Tues1", edtsubj1.getText().toString()).apply();
                    }
                    if(!edtsubj2.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Tues2", edtsubj2.getText().toString()).apply();
                    }
                    if(!edtsubj3.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Tues3", edtsubj3.getText().toString()).apply();
                    }
                    if(!edtsubj4.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Tues4", edtsubj4.getText().toString()).apply();
                    }
                    if(!edtsubj5.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Tues5", edtsubj5.getText().toString()).apply();
                    }
                    finish();
                }else if(editDay.equalsIgnoreCase("Wednesday")) {
                    if(!edtsubj1.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Wed1", edtsubj1.getText().toString()).apply();
                    }
                    if(!edtsubj2.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Wed2", edtsubj2.getText().toString()).apply();
                    }
                    if(!edtsubj3.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Wed3", edtsubj3.getText().toString()).apply();
                    }
                    if(!edtsubj4.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Wed4", edtsubj4.getText().toString()).apply();
                    }
                    if(!edtsubj5.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Wed5", edtsubj5.getText().toString()).apply();
                    }
                    finish();
                }else {
                    if(!edtsubj1.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Sat1", edtsubj1.getText().toString()).apply();
                    }
                    if(!edtsubj2.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Sat2", edtsubj2.getText().toString()).apply();
                    }
                    if(!edtsubj3.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Sat3", edtsubj3.getText().toString()).apply();
                    }
                    if(!edtsubj4.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Sat4", edtsubj4.getText().toString()).apply();
                    }
                    if(!edtsubj5.getText().toString().equals("")) {
                        ScheduleJava.sharedPreferences.edit().putString("Sat5", edtsubj5.getText().toString()).apply();
                    }
                    finish();
                }
            }
        });

    }

    private void setupViews(){
        toolbar = findViewById(R.id.toolbaredit);
        btnSave = findViewById(R.id.btnSave);
        edtsubj1 = findViewById(R.id.edtsubj1);
        edtsubj2 = findViewById(R.id.edtsubj2);
        edtsubj3 = findViewById(R.id.edtsubj3);
        edtsubj4 = findViewById(R.id.edtsubj4);
        edtsubj5 = findViewById(R.id.edtsubj5);

    }
    private void initToolbar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Edit");
    }
}