package com.cookandroid.all_about_sookmyung;

import android.app.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import androidx.annotation.*;

public class ClassInfoDialogFragment extends androidx.fragment.app.DialogFragment {
    String roomName, doorString; // 강의실 호수 또는 이름
    int roomKind; // 강의실 형태
    boolean plugExist; // 뒷문 콘센트 존재 유무

    TextView roomNumberTextView, backdoorTextview, plugTextView, roomKindTextView;
    ImageView backdoorImageView, plugImageView, roomKindImageView;
    ImageButton exitBtn;
    Button timeTableBtn;

    public ClassInfoDialogFragment (String roomName, String doorString, boolean plugExist, int roomKind) {
        this.roomName = roomName;
        this.doorString = doorString;
        this.plugExist = plugExist;
        this.roomKind = roomKind;
    }

    public static ClassInfoDialogFragment getInstance(String roomName, String doorString, boolean plugExist, int roomKind) {
        ClassInfoDialogFragment e = new ClassInfoDialogFragment(roomName, doorString, plugExist, roomKind);
        e.setStyle(STYLE_NO_TITLE, R.style.NewDialog);
        return e;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.classroom_information, null);

        roomNumberTextView = (TextView) view.findViewById(R.id.roomNumber); // 텍스트들 가져오기
        backdoorTextview = (TextView) view.findViewById(R.id.backdoorText);
        plugTextView = (TextView) view.findViewById(R.id.plugText);
        roomKindTextView = (TextView) view.findViewById(R.id.kindText);

        backdoorImageView = (ImageView) view.findViewById(R.id.backdoorImage); // 이미지들 가져오기
        plugImageView = (ImageView) view.findViewById(R.id.plugImage);
        roomKindImageView = (ImageView) view.findViewById(R.id.kindImage);

        roomNumberTextView.setText(roomName); // 강의실 이름 설정

        backdoorTextview.setText(doorString);
        if (doorString.equals("앞문만") || doorString.equals("뒷문만") || doorString.equals("중문만")){
            backdoorImageView.setImageResource(R.drawable.ic_classroom_backdoor_absence);
        } else {
            backdoorImageView.setImageResource(R.drawable.ic_classroom_backdoor_existed);
        }

        // 플러그 유무
        if (plugExist){
            plugTextView.setText("콘센트 O");
            plugImageView.setImageResource(R.drawable.ic_classroom_plug_existed);
        } else {
            plugTextView.setText("콘센트 X");
            plugImageView.setImageResource(R.drawable.ic_classroom_plug_absence);
        }

        // 강의실 형태
        if (roomKind == 0) { // 교실형
            roomKindTextView.setText("교실형");
            roomKindImageView.setImageResource(R.drawable.ic_classroom_table);
        } else if (roomKind == 1) { // 계단형
            roomKindTextView.setText("계단형");
            roomKindImageView.setImageResource(R.drawable.ic_classroom_stair);
        } else if (roomKind == 2) { // 조별책상형
            roomKindTextView.setText("조별책상");
            roomKindImageView.setImageResource(R.drawable.ic_classroom_grouptable);
        }

        exitBtn = (ImageButton) view.findViewById(R.id.exitBtn);
        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        timeTableBtn = (Button) view.findViewById(R.id.timeTableLinkBtn);
        timeTableBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TimeTableActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}

