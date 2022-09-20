package com.example.buttondemoone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button login ;
    Button logout;
    TextView textShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        logout = findViewById(R.id.logout);
        textShow = findViewById(R.id.textShow);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textShow.setText("Login button is clicked.");
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textShow.setText("Logout button is clicked.");

            }
        });

    }

}
