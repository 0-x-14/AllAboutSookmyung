package com.cookandroid.all_about_sookmyung;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MapMyungsinFloor3Activity extends AppCompatActivity {
    Animation fab_open, fab_close;
    Boolean isFabOpen = false;
    FloatingActionButton fab, fab1, fab2;
    Context context;

    Button movementSub1, movementSub2, movementSub4, movementSub5, movementSub6, movementSub7;
    ImageButton r301Btn, r302Btn, r303Btn, r304Btn, r305Btn, r308Btn, r309Btn, r310Btn,
                r311aBtn, r311bBtn, r312aBtn, r312bBtn, r313Btn, r314Btn, r315Btn, r316Btn, r316aBtn, r317Btn,
                rCleanBtn,r318Btn, r319Btn, r320Btn, r321Btn, r321aBtn, r322Btn, r323Btn, r324Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myungsin_floor3);

        movementSub1 = findViewById(R.id.button);
        movementSub2 = findViewById(R.id.button2);
        movementSub4 = findViewById(R.id.button4);
        movementSub5 = findViewById(R.id.button5);
        movementSub6 = findViewById(R.id.button6);
        movementSub7 = findViewById(R.id.button7);

        movementSub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor3Activity.this, MapMyungsinFloor1Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor3Activity.this, MapMyungsinFloor2Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor3Activity.this, MapMyungsinFloor4Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor3Activity.this, MapMyungsinFloor5Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor3Activity.this, MapMyungsinFloor6Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor3Activity.this, MapMyungsinFloor7Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        context = getApplicationContext();
        fab_open = AnimationUtils.loadAnimation(context, R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(context, R.anim.fab_close);

        fab = (FloatingActionButton) findViewById(R.id.fab_main);
        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anim();
            }
        });

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 2022-12-17 사물함
            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity(); // 캠퍼스 지도로
            }
        });

        r301Btn = (ImageButton) findViewById(R.id.room301);
        r301Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("301", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r302Btn = (ImageButton) findViewById(R.id.room302);
        r302Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("302", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r303Btn = (ImageButton) findViewById(R.id.room303);
        r303Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("303", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r304Btn = (ImageButton) findViewById(R.id.room304);
        r304Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("304", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r305Btn = (ImageButton) findViewById(R.id.room305);
        r305Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("305", "중문만", true, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r308Btn = (ImageButton) findViewById(R.id.room308);
        r308Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("308", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r309Btn = (ImageButton) findViewById(R.id.room309);
        r309Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("309", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r310Btn = (ImageButton) findViewById(R.id.room310);
        r310Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("310", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r311aBtn = (ImageButton) findViewById(R.id.room311a);
        r311aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("311a", "소프트웨어학부 과방");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r311bBtn = (ImageButton) findViewById(R.id.room311b);
        r311bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("311b", "영어영문학부 과방");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r312aBtn = (ImageButton) findViewById(R.id.room312a);
        r312aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("312a", "체육교육과 과방");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r312bBtn = (ImageButton) findViewById(R.id.room312b);
        r312bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("312b", "무용과 과방");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r313Btn = (ImageButton) findViewById(R.id.room313);
        r313Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("313", "뒷문만", false, 0);
            }
        });

        r314Btn = (ImageButton) findViewById(R.id.room314);
        r314Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("314", "미디어학부 편집실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r315Btn = (ImageButton) findViewById(R.id.room315);
        r315Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("315", "추후 업데이트");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r316Btn = (ImageButton) findViewById(R.id.room316);
        r316Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("316", "뒷문만", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r316aBtn = (ImageButton) findViewById(R.id.room316a);
        r316aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("316a", "연구실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r317Btn = (ImageButton) findViewById(R.id.room317);
        r317Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("317", "앞문만", false, 1);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r318Btn = (ImageButton) findViewById(R.id.room318);
        r318Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("318", "앞문만", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r319Btn = (ImageButton) findViewById(R.id.room319);
        r319Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("319", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r320Btn = (ImageButton) findViewById(R.id.room320);
        r320Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("320", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r321Btn = (ImageButton) findViewById(R.id.room321);
        r321Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("321", "앞문만", true, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r321aBtn = (ImageButton) findViewById(R.id.room321a);
        r321aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("321a", "문화관광외식학부 과방");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r322Btn = (ImageButton) findViewById(R.id.room322);
        r322Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("322", "앞문과 뒷문", false, 1);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r323Btn = (ImageButton) findViewById(R.id.room323);
        r323Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("323", "교육학부 과방");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r324Btn = (ImageButton) findViewById(R.id.room324);
        r324Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("324","가족자원경영학과,\n아동복지학부 과방");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });
    }

    public void anim() {
        if (isFabOpen) {
            fab1.startAnimation(fab_close);
            fab2.startAnimation(fab_close);
            fab1.setClickable(false);
            fab2.setClickable(false);
            isFabOpen = false;
        } else {
            fab1.startAnimation(fab_open);
            fab2.startAnimation(fab_open);
            fab1.setClickable(true);
            fab2.setClickable(true);
            isFabOpen = true;
        }
    }
}
