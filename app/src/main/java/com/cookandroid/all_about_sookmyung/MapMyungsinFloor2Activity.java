package com.cookandroid.all_about_sookmyung;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MapMyungsinFloor2Activity extends AppCompatActivity{
    Animation fab_open, fab_close;
    Boolean isFabOpen = false;
    FloatingActionButton fab, fab1, fab2;
    Context context;

    Button movementSub1, movementSub3, movementSub4, movementSub5, movementSub6, movementSub7;
    ImageButton r201Btn, r202Btn, r203Btn, r204Btn, r207Btn, r208aBtn, r208bBtn, r209Btn, r210Btn, r211Btn, r212Btn, r213Btn, r214Btn, r215Btn, r218aBtn, r218bBtn, r219Btn, r220aBtn, r220bBtn, r221Btn;

    // TODO: 2022-12-17 Image 버튼 구현 요망(선언부터), 파란 강의실은 ClassInfoDialogFragment, 회색은 편집 중
    //       강의실 201 207 209 210 211 213 214 215 217 221
    //       과방 208a 208b 218a 219 220a 220b
    //       회색 212 218b

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myungsin_floor2);

        movementSub1 = findViewById(R.id.button);
        movementSub3 = findViewById(R.id.button3);
        movementSub4 = findViewById(R.id.button4);
        movementSub5 = findViewById(R.id.button5);
        movementSub6 = findViewById(R.id.button6);
        movementSub7 = findViewById(R.id.button7);

        movementSub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor2Activity.this, MapMyungsinFloor1Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor2Activity.this, MapMyungsinFloor3Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor2Activity.this, MapMyungsinFloor4Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor2Activity.this, MapMyungsinFloor5Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor2Activity.this, MapMyungsinFloor6Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor2Activity.this, MapMyungsinFloor7Activity.class);
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

        r201Btn = (ImageButton) findViewById(R.id.room201);
        r201Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment room201Dialog = ClassInfoDialogFragment.getInstance("201", "앞문과 뒷문", true, 0);
                room201Dialog.show(getSupportFragmentManager(), "201");
            }
        });

        r202Btn = (ImageButton) findViewById(R.id.room202);
        r202Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment room202Dialog = ClassInfoDialogFragment.getInstance("202", "앞문과 뒷문", true, 0);
                room202Dialog.show(getSupportFragmentManager(), "202");
            }
        });

        r203Btn = (ImageButton) findViewById(R.id.room203);
        r203Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment room203Dialog = ClassInfoDialogFragment.getInstance("203", "앞문과 뒷문", true, 0);
                room203Dialog.show(getSupportFragmentManager(), "203");
            }
        });

        r204Btn = (ImageButton) findViewById(R.id.room204);
        r204Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment room204Dialog = ClassInfoDialogFragment.getInstance("204", "앞문과 뒷문", true, 0);
                room204Dialog.show(getSupportFragmentManager(), "204");
            }
        });

        r207Btn = (ImageButton) findViewById(R.id.room207);
        r207Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialog = ClassInfoDialogFragment.getInstance("207", "중문만", false, 0);
                classInfoDialog.show(getSupportFragmentManager(), "");
            }
        });

        r208aBtn = (ImageButton) findViewById(R.id.room208a);
        r208aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialog = ElseInfoDialogFragment.getInstance("218a", "한국어문학부 과방");
                elseInfoDialog.show(getSupportFragmentManager(), "");
            }
        });

        r208bBtn = (ImageButton) findViewById(R.id.room208b);
        r208bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("208b", "식품영양학과 과방");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r209Btn = (ImageButton) findViewById(R.id.room209);
        r209Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("209", "앞문과 뒷문", true, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r210Btn = (ImageButton) findViewById(R.id.room210);
        r210Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("210", "앞문과 뒷문", true, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r211Btn = (ImageButton) findViewById(R.id.room211);
        r211Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("211", "앞문과 뒷문", true, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r212Btn = (ImageButton) findViewById(R.id.room212);
        r212Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("212", "교원라운지");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r213Btn = (ImageButton) findViewById(R.id.room213);
        r213Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("213", "세미나실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r214Btn = (ImageButton) findViewById(R.id.room214);
        r214Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("214", "정순옥 라운지");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r215Btn = (ImageButton) findViewById(R.id.room215);
        r215Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("215", "앞문만", false, 1);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r218aBtn = (ImageButton) findViewById(R.id.room218a);
        r218aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("218a", "정치외교학과 과방");
            }
        });

        r218bBtn = (ImageButton) findViewById(R.id.room218b);
        r218bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment room218bDialog = ElseInfoDialogFragment.getInstance("218b", "분리수거 작업실");
                room218bDialog.show(getSupportFragmentManager(), "218b");
            }
        });

        r219Btn = (ImageButton) findViewById(R.id.room219);
        r219Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("219", "경제학부 과방");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r220aBtn = (ImageButton) findViewById(R.id.room220a);
        r220aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("220a", "미디어학부 과방");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r220bBtn = (ImageButton) findViewById(R.id.room220b);
        r220bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("220b", "경영학부 과방");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r221Btn = (ImageButton) findViewById(R.id.room221);
        r221Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("221", "앞문만", true, 1);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
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
