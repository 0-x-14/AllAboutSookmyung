package com.cookandroid.all_about_sookmyung;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MapMyungsinFloor6Activity extends AppCompatActivity {
    Button movementSub1, movementSub2, movementSub3, movementSub4, movementSub5, movementSub7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myungsin_floor6);

        movementSub1 = findViewById(R.id.button);
        movementSub2 = findViewById(R.id.button2);
        movementSub3 = findViewById(R.id.button3);
        movementSub4 = findViewById(R.id.button4);
        movementSub5 = findViewById(R.id.button5);
        movementSub7 = findViewById(R.id.button7);

        movementSub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor6Activity.this, MapMyungsinFloor1Activity.class);
                //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        movementSub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor6Activity.this, MapMyungsinFloor2Activity.class);
                // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        movementSub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor6Activity.this, MapMyungsinFloor3Activity.class);
                // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        movementSub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor6Activity.this, MapMyungsinFloor5Activity.class);
                //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        movementSub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor6Activity.this, MapMyungsinFloor6Activity.class);
                //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        movementSub7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor6Activity.this, MapMyungsinFloor7Activity.class);
            }
        });
    }
}
