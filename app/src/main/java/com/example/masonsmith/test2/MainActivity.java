package com.example.masonsmith.test2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onclick();
    }
    private void onclick(){
        Button test = (Button) findViewById(R.id.button);
            test.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent test = new Intent(MainActivity.this, Test.class);
                    startActivity(test);
                }
            });
        }
    }
