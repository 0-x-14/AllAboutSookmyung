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

public class MapMyungsinFloor1Activity extends AppCompatActivity {
    Animation fab_open, fab_close;
    Boolean isFabOpen = false, isVisible = false;
    FloatingActionButton fab, fab1, fab2;
    Context context;
    ImageView main, locker;

    Button movementSub2, movementSub3, movementSub4, movementSub5, movementSub6, movementSub7;
    ImageButton r101Btn,r102Btn, r103Btn, r104Btn, r106Btn, r107Btn, r108Btn, r109Btn;
    // TODO: 2022-12-17 Image 버튼 구현 요망, 파란 강의실은 ClassInfoDialogFragment, 회색은 편집 중

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myungsin_floor1);

        movementSub2 = findViewById(R.id.button2);
        movementSub3 = findViewById(R.id.button3);
        movementSub4 = findViewById(R.id.button4);
        movementSub5 = findViewById(R.id.button5);
        movementSub6 = findViewById(R.id.button6);
        movementSub7 = findViewById(R.id.button7);

        movementSub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor1Activity.this, MapMyungsinFloor2Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor1Activity.this, MapMyungsinFloor3Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor1Activity.this, MapMyungsinFloor4Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor1Activity.this, MapMyungsinFloor5Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor1Activity.this, MapMyungsinFloor6Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor1Activity.this, MapMyungsinFloor7Activity.class);
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

        main = (ImageView) findViewById(R.id.imageView4) ;
        locker = (ImageView) findViewById(R.id.floor1_locker);

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

        r101Btn = (ImageButton) findViewById(R.id.room101);
        r101Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("101", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r102Btn = (ImageButton) findViewById(R.id.room102);
        r102Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("102", "추후 업데이트");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r103Btn = (ImageButton) findViewById(R.id.room103);
        r103Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("103", "뒷문만", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r104Btn = (ImageButton) findViewById(R.id.room104);
        r104Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("104", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r106Btn = (ImageButton) findViewById(R.id.room106);
        r106Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("106", "뒷문만", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r107Btn = (ImageButton) findViewById(R.id.room107);
        r107Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("107", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r108Btn = (ImageButton) findViewById(R.id.room108);
        r108Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("108", "프린터실");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r109Btn = (ImageButton) findViewById(R.id.room109);
        r109Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("109", "중문만", false, 0);
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
