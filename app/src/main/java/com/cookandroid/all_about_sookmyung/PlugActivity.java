package com.cookandroid.all_about_sookmyung;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlugActivity extends AppCompatActivity {

    ListView listView;
    PlugAdapter plugAdapter;
    ArrayList<PlugItem> PlugItem_ArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plug);
        listView = (ListView)findViewById(R.id.plug_listview);

        PlugItem_ArrayList = new ArrayList<PlugItem>();

        PlugItem_ArrayList.add(new PlugItem("층", "호수", "플러그 유무", "기타"));
        PlugItem_ArrayList.add(new PlugItem("2층", "정순옥라운지", "O", "라운지"));
        PlugItem_ArrayList.add(new PlugItem("2층", "213호", "O", "세미나실"));
        PlugItem_ArrayList.add(new PlugItem("3층", "305호", "O", "실습실"));
        PlugItem_ArrayList.add(new PlugItem("4층", "업데이트중", "-", "-"));
        PlugItem_ArrayList.add(new PlugItem("5층", "PBL강의실", "O", "조별 책상 위"));
        PlugItem_ArrayList.add(new PlugItem("5층", "520호", "O", "2자리당 1개"));

        // 건물 추가
        // 새힘관 및 기타 건물 추가

        plugAdapter = new PlugAdapter(PlugActivity.this, PlugItem_ArrayList);
        listView.setAdapter(plugAdapter);

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
