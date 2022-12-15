package com.cookandroid.all_about_sookmyung;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MajorAdapter extends BaseAdapter {
    Context context;
    ArrayList<MajorItem> MajorItem_ArrayList;
    TextView majorName_textview;
    TextView majorRoom_textview;
    TextView majorOffice_textview;
    TextView locker_textview;

    public MajorAdapter(Context context, ArrayList<MajorItem> majorItem_ArrayList) {
        this.context = context;
        MajorItem_ArrayList = majorItem_ArrayList;
    } // 생성자

    @Override
    public int getCount() {
        return this.MajorItem_ArrayList.size();
    } // 리스트뷰가 몇개의 아이템을 가지고 있는지 알려주는 함수

    @Override
    public Object getItem(int position) {
        return this.MajorItem_ArrayList.get(position);
    } // 현재 어떤 아이템인지를 알려줌

    @Override
    public long getItemId(int position) {
        return position;
    } // 현재 어떤 포지션인지를 알려줌

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.activity_major_item, null);
            majorName_textview = (TextView)view.findViewById(R.id.majorName_textview);
            majorRoom_textview = (TextView)view.findViewById(R.id.majorRoom_textview);
            majorOffice_textview = (TextView)view.findViewById(R.id.majorOffice_textview);
            locker_textview = (TextView)view.findViewById(R.id.locker_textview);
        }

        majorName_textview.setText(MajorItem_ArrayList.get(position).getMajorName_textview());
        majorRoom_textview.setText(MajorItem_ArrayList.get(position).getMajorRoom_textview());
        majorOffice_textview.setText(MajorItem_ArrayList.get(position).getMajorOffice_textview());
        locker_textview.setText(MajorItem_ArrayList.get(position).getLocker_textview());

        return view;
    } // 리스트뷰에서 아이템과 xml을 연결하여 화면에 표시해줌
}
