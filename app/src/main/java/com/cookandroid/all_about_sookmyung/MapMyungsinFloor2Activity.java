package com.cookandroid.all_about_sookmyung;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MapMyungsinFloor2Activity extends AppCompatActivity {
    Button r204Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myungsin_floor2);

        r204Btn = (Button) findViewById(R.id.room204);
        r204Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment room204Dialog = ClassInfoDialogFragment.getInstance("204호", "앞문", true, 0);
                room204Dialog.show(getSupportFragmentManager(), "204호");
            }
        });
    }
}
