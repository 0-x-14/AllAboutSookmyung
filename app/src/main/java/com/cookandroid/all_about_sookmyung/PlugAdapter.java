package com.cookandroid.all_about_sookmyung;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PlugAdapter extends BaseAdapter {
    // 내용을 반복해서 보여주는데 도움을 주는 BaseAdapter

    Context context;
    ArrayList<PlugItem> PlugItem_ArrayList;
    TextView building_textview;
    TextView floor_textview;
    TextView room_textview;
    TextView plug_textview;
    TextView etc_textview;

    public PlugAdapter(Context context, ArrayList<PlugItem> plugItem_ArrayList) {
        this.context = context;
        PlugItem_ArrayList = plugItem_ArrayList;
    } // 생성자

    @Override
    public int getCount() {
        return this.PlugItem_ArrayList.size();
    } // 리스트뷰가 몇개의 아이템을 가지고 있는지 알려주는 함수

    @Override
    public Object getItem(int position) {
        return this.PlugItem_ArrayList.get(position);
    } // 현재 어떤 아이템인지를 알려줌

    @Override
    public long getItemId(int position) {
        return position;
    } // 현재 어떤 포지션인지를 알려줌

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.activity_plug_item, null);
            building_textview = (TextView)view.findViewById(R.id.building_textview);
            floor_textview = (TextView)view.findViewById(R.id.floor_textview);
            room_textview = (TextView)view.findViewById(R.id.room_textview);
            plug_textview = (TextView)view.findViewById(R.id.plug_textview);
            etc_textview = (TextView)view.findViewById(R.id.etc_textview);
        }

        building_textview.setText(PlugItem_ArrayList.get(position).getBuilding_textview());
        floor_textview.setText(PlugItem_ArrayList.get(position).getFloor_textview());
        room_textview.setText(PlugItem_ArrayList.get(position).getRoom_textview());
        plug_textview.setText(PlugItem_ArrayList.get(position).getPlug_textview());
        etc_textview.setText(PlugItem_ArrayList.get(position).getEtc_textview());

        return view;
    } // 리스트뷰에서 아이템과 xml을 연결하여 화면에 표시해줌
}
