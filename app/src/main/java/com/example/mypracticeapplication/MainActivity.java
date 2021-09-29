package com.example.mypracticeapplication;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button aimbt = findViewById(R.id.main_gotodetail);
        final EditText user_input = findViewById(R.id.user_input);

        aimbt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                ArrayList<Country> countriesArrayList = Country.getCountries();
                Country c= null;
                user_input.setText(String.valueOf(c.getCountryCode()));

                user_input.getText().toString();


                    Intent intent = new Intent(MainActivity.this, detailActivity.class);
                    intent.putExtra("UserData", String.valueOf(c.getCountry()));
                    startActivity(intent);


            }
        });


    }
}

