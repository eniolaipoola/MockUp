package com.example.ehnyn.designui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextButton = (Button) findViewById(R.id.btnNext);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Mock up 2", Toast.LENGTH_SHORT).show();
                Intent homeIntent = new Intent(MainActivity.this, Page2Activity.class);
                startActivity(homeIntent);
            }
        });
    }
}
