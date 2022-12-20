package com.cookandroid.all_about_sookmyung;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MajorActivity extends AppCompatActivity {

    ListView listView;
    MajorAdapter majorAdapter;
    ArrayList<MajorItem> MajorItem_ArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major);
        listView = (ListView)findViewById(R.id.major_listview);

        MajorItem_ArrayList = new ArrayList<MajorItem>();

        MajorItem_ArrayList.add(new MajorItem("가족자원경영학과", "명신관 324호", "순헌관 323A호", "순헌라커라운지"));
        MajorItem_ArrayList.add(new MajorItem("경영학부", "명신관 220B호", "순헌관 316A호", "순헌라커라운지"));
        MajorItem_ArrayList.add(new MajorItem("경제학부", "명신관 219호", "순헌관 315호", "명신관 3층 중앙 \n명신관 320호 앞 \n명신관 322호 앞 \n명신관 614호 앞"));
        MajorItem_ArrayList.add(new MajorItem("교육학부", "명신관 323호", "순헌관 921호", "명신관 303호 앞\n명신관 619호 앞\n명신관 619호 맞은편\n새힘관 1층 엘리베이터 옆"));
        MajorItem_ArrayList.add(new MajorItem("글로벌서비스학부", "명신관 623B호", "백주년기념관 512호", "-"));
        MajorItem_ArrayList.add(new MajorItem("독일언어문화학과", "순헌관 508B호", "순헌관 316B호", "순헌라커라운지"));
        MajorItem_ArrayList.add(new MajorItem("문헌정보학과", "순헌관 510A호", "순헌관 220호", "순헌라커라운지"));
        MajorItem_ArrayList.add(new MajorItem("미디어학부", "명신관 220A호", "새힘관 201호", "명신관 218AB호 사이\n명신관 317호 앞\n명신관 617호 앞"));
        MajorItem_ArrayList.add(new MajorItem("법학부", "-", "진리관 209호", "순헌라커라운지\n진리관 105호 락카룸"));
        MajorItem_ArrayList.add(new MajorItem("비즈니스애널리틱전공", "-", "-", "명신관 3층 중앙\n명신관 312AB호 사이\n명신관 3층 통로"));
        MajorItem_ArrayList.add(new MajorItem("사회심리학과", "순헌관 414B호", "순헌관 721호", "명신관 522호 옆"));
        MajorItem_ArrayList.add(new MajorItem("소비자경제학과", "명신관 623C호", "순헌관 312호", "명신관 614호 앞\n순헌라커라운지"));
        MajorItem_ArrayList.add(new MajorItem("소프트웨어학부", "명신관 311A호", "명신관 425호", "명신관 4층 중앙\n명신관 4층 신명신"));
        MajorItem_ArrayList.add(new MajorItem("식품영양학과", "명신관 208B호", "순헌관 323B호", "순헌라커라운지"));
        MajorItem_ArrayList.add(new MajorItem("아동복지학과", "명신관 324호", "순헌관 323호", "순헌라커라운지"));
        MajorItem_ArrayList.add(new MajorItem("역사문화학과", "순헌관 508A호", "순헌관 412호", "명신관 219호 220호 사이 \n명신관 314호 315호 사이 \n명신관 319호 앞"));
        MajorItem_ArrayList.add(new MajorItem("영어영문학부", "명신관 311B호", "진리관 303호", "명신관 614호 앞 \n명신관 620호 앞\n순헌라커라운지"));
        MajorItem_ArrayList.add(new MajorItem("의류학과", "순헌관 510B호", "순헌관 323B호", "순헌라커라운지"));
        MajorItem_ArrayList.add(new MajorItem("인공지능공학부", "명신관 504호", "명신관 513호", "명신관 221호 앞\n명신관 5층 중앙\n명신관 516호 맞은편\n명신관 517호 옆\n명신관 518호 옆\n명신관 526호 옆"));
        MajorItem_ArrayList.add(new MajorItem("일본학과", "순헌관 508D호", "명신관 602호", "명신관 520호 앞\n순헌라커라운지"));
        MajorItem_ArrayList.add(new MajorItem("정치외교학과", "명신관 218호", "순헌관 313호", "명신관 218AB호 사이\n명신관 219호 220호 사이\n명신관 319호 앞\n명신관 5층 중앙"));
        MajorItem_ArrayList.add(new MajorItem("중어중문학부", "순헌관 508C호", "순헌관 311호", "명신관 4층 중앙\n명신관 517호 옆\n명신관 616호 앞\n명신관 621호 앞\n순헌라커라운지"));
        MajorItem_ArrayList.add(new MajorItem("프랑스언어문화학과", "순헌관 508B호", "순헌관 314호", "순헌라커라운지"));
        MajorItem_ArrayList.add(new MajorItem("한국어문학부", "명신관 208A호", "순헌관 411호", "명신관 6층 중앙\n순헌라커라운지"));
        MajorItem_ArrayList.add(new MajorItem("행정학과", "순헌관 지하 1층", "순헌관 313호", "명신관 2층 입구\n명신관 218AB호 사이\n명신관 5층 중앙\n명신관 616호 앞"));
        MajorItem_ArrayList.add(new MajorItem("홍보광고학과", "명신관 623A호", "순헌관 312호", "명신관 218AB호 사이\n명신관 219호 220호 사이"));


        majorAdapter = new MajorAdapter(MajorActivity.this, MajorItem_ArrayList);
        listView.setAdapter(majorAdapter);

        Button backbutton = (Button) findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        // backbutton을 누르면 해당 페이지 종료
    }
}