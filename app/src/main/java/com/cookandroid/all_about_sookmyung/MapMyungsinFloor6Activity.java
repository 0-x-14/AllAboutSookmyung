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

public class MapMyungsinFloor6Activity extends AppCompatActivity {
    Animation fab_open, fab_close;
    Boolean isFabOpen = false, isVisible = false;
    FloatingActionButton fab, fab1, fab2;
    Context context;
    ImageView main, locker;

    Button movementSub1, movementSub2, movementSub3, movementSub4, movementSub5, movementSub7;
    ImageButton r601Btn, r602Btn, r603Btn, r604Btn, r605Btn, r606Btn, r607Btn, r608Btn, r609Btn,
            r610Btn, r612Btn, r613Btn, r614Btn, r615Btn, r616Btn, r617Btn, r619Btn, r620Btn,
            r621Btn, r622Btn, r623bcBtn, r623aBtn, r624Btn, room_lab;

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
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor6Activity.this, MapMyungsinFloor2Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor6Activity.this, MapMyungsinFloor3Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor6Activity.this, MapMyungsinFloor5Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor6Activity.this, MapMyungsinFloor5Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        movementSub7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapMyungsinFloor6Activity.this, MapMyungsinFloor7Activity.class);
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
        locker = (ImageView) findViewById(R.id.floor6_locker);

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

        r601Btn = (ImageButton) findViewById(R.id.room601);
        r601Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("601", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r602Btn = (ImageButton) findViewById(R.id.room602);
        r602Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("602", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r603Btn = (ImageButton) findViewById(R.id.room603);
        r603Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("603", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r604Btn = (ImageButton) findViewById(R.id.room604);
        r604Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("604", "문화관광외식학부 과방");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r605Btn = (ImageButton) findViewById(R.id.room605);
        r605Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("605", "앞문만", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r606Btn = (ImageButton) findViewById(R.id.room606);
        r606Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("606", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r607Btn = (ImageButton) findViewById(R.id.room607);
        r607Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("607", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r608Btn = (ImageButton) findViewById(R.id.room608);
        r608Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("608", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r609Btn = (ImageButton) findViewById(R.id.room609);
        r609Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("609", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r610Btn = (ImageButton) findViewById(R.id.room610);
        r610Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("610", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r612Btn = (ImageButton) findViewById(R.id.room612);
        r612Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("612", "앞문만", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r613Btn = (ImageButton) findViewById(R.id.room613);
        r613Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("613", "앞문만", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r614Btn = (ImageButton) findViewById(R.id.room614);
        r614Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("614", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r615Btn = (ImageButton) findViewById(R.id.room615);
        r615Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("615", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r617Btn = (ImageButton) findViewById(R.id.room617);
        r617Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("617", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r619Btn = (ImageButton) findViewById(R.id.room619);
        r619Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("619", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r620Btn = (ImageButton) findViewById(R.id.room620);
        r620Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("620", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r621Btn = (ImageButton) findViewById(R.id.room621);
        r620Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("621", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r622Btn = (ImageButton) findViewById(R.id.room622);
        r620Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("622", "앞문과 뒷문", false, 0);
                classInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r623aBtn = (ImageButton) findViewById(R.id.room623a);
        r623aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("623a", "홍보광고학과 과방");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r623bcBtn = (ImageButton) findViewById(R.id.room623bc);
        r623bcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ElseInfoDialogFragment elseInfoDialogFragment = ElseInfoDialogFragment.getInstance("623bc", "글로벌서비스학부 / 소비자경제학과 과방");
                elseInfoDialogFragment.show(getSupportFragmentManager(), "");
            }
        });

        r624Btn = (ImageButton) findViewById(R.id.room624);
        r624Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassInfoDialogFragment classInfoDialogFragment = ClassInfoDialogFragment.getInstance("624", "뒷문만", false, 0);
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
