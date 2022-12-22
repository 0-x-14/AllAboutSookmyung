package com.cookandroid.all_about_sookmyung;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MapMyungsinFloor4Activity extends AppCompatActivity {
    Animation fab_open, fab_close;
    Boolean isFabOpen = false, isVisible = false;
    FloatingActionButton fab, fab1, fab2;
    Context context;
    ImageView main, locker;

    Button movementSub1, movementSub2, movementSub3, movementSub5, movementSub6, movementSub7;
    ImageButton r402aBtn, r402bBtn, r403aBtn, r403bBtn, r404aBtn, r404bBtn, r405aBtn, r405bBtn, r406Btn,
            r408Btn, r409Btn, r410aBtn, r410bBtn, r411aBtn, r411bBtn, r413Btn, r414Btn, r415Btn, r416Btn,
            r417Btn, r417aBtn, r418Btn, r420Btn, r421Btn, r423Btn, r424Btn, r425Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myungsin_floor4);

        movementSub1 = findViewById(R.id.button);
        movementSub2 = findViewById(R.id.button2);
        movementSub3 = findViewById(R.id.button3);
        movementSub5 = findViewById(R.id.button5);
        movementSub6 = findViewById(R.id.button6);
        movementSub7 = findViewById(R.id.button7);

        movementSub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor4Activity.this, MapMyungsinFloor1Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor4Activity.this, MapMyungsinFloor2Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor4Activity.this, MapMyungsinFloor3Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor4Activity.this, MapMyungsinFloor5Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor4Activity.this, MapMyungsinFloor6Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor4Activity.this, MapMyungsinFloor7Activity.class);
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

        main = (ImageView) findViewById(R.id.imageView4);
        locker = (ImageView) findViewById(R.id.floor4_locker);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anim();
            }
        });

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isVisible){
                    locker.setVisibility(View.VISIBLE);
                    main.setVisibility(View.INVISIBLE);
                    isVisible = true;
                }
                else {
                    locker.setVisibility(View.INVISIBLE);
                    main.setVisibility(View.VISIBLE);
                    isVisible = false;
                }
            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity(); // 캠퍼스 지도로
            }
        });

        r402aBtn = (ImageButton) findViewById(R.id.room402a);
        r402aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("402a", "대학원 연구실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r402bBtn = (ImageButton) findViewById(R.id.room402b);
        r402bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("402b", "대학원 연구실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r403aBtn = (ImageButton) findViewById(R.id.room403a);
        r403aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("403a", "대학원 연구실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r403bBtn = (ImageButton) findViewById(R.id.room403b);
        r403bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("403b", "대학원 연구실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r404aBtn = (ImageButton) findViewById(R.id.room404a);
        r404aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("404a", "대학원 연구실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r404bBtn = (ImageButton) findViewById(R.id.room404b);
        r404bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("404b", "대학원 연구실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r405aBtn = (ImageButton) findViewById(R.id.room405a);
        r405aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("405a", "대학원 연구실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r405bBtn = (ImageButton) findViewById(R.id.room405b);
        r405bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("405b", "대학원 연구실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r406Btn = (ImageButton) findViewById(R.id.room406);
        r406Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("406", "소프트웨어학부 삼성실습실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r408Btn = (ImageButton) findViewById(R.id.room408);
        r408Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("408", "앞문과 뒷문", true, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        // 409 추가해야 함

        r410aBtn = (ImageButton) findViewById(R.id.room410a);
        r410aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("410a", "대학원 연구실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r410bBtn = (ImageButton) findViewById(R.id.room410b);
        r410bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("410b", "대학원 연구실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r411aBtn = (ImageButton) findViewById(R.id.room411a);
        r411aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("411a", "대학원 연구실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r411bBtn = (ImageButton) findViewById(R.id.room411b);
        r411bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("411b", "대학원 연구실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r413Btn = (ImageButton) findViewById(R.id.room413);
        r413Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("413", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r414Btn = (ImageButton) findViewById(R.id.room414);
        r414Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("414", "앞문만", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r415Btn = (ImageButton) findViewById(R.id.room415);
        r415Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("415", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r416Btn = (ImageButton) findViewById(R.id.room416);
        r416Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("416", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r417Btn = (ImageButton) findViewById(R.id.room417);
        r417Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("417", "앞문만", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        // 417A 추가해야 함

        r418Btn = (ImageButton) findViewById(R.id.room418);
        r418Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("418", "앞문만", false, 1);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r420Btn = (ImageButton) findViewById(R.id.room420);
        r420Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("420", "앞문과 중문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r421Btn = (ImageButton) findViewById(R.id.room421);
        r421Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("421", "앞문과 중문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r423Btn = (ImageButton) findViewById(R.id.room423);
        r423Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("423", "앞문과 뒷문", false, 1);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r424Btn = (ImageButton) findViewById(R.id.room424);
        r424Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("424", "데이터사이언스전공 사무실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r424Btn = (ImageButton) findViewById(R.id.room424);
        r424Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("424", "데이터사이언스전공 사무실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r425Btn = (ImageButton) findViewById(R.id.room425);
        r425Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("425", "컴퓨터과학전공 사무실");
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
