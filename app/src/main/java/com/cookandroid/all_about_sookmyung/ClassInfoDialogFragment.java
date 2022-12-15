package com.cookandroid.all_about_sookmyung;

import android.app.*;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import androidx.annotation.*;

public class ClassInfoDialogFragment extends androidx.fragment.app.DialogFragment {
    String roomName; // 강의실 호수 또는 이름
    int roomKind; // 강의실 형태
    boolean backdoorExist, plugExist; // 뒷문 콘센트 존재 유무

    public ClassInfoDialogFragment (String roomName, boolean backdoorExist, boolean plugExist, int roomKind) {
        this.roomName = roomName;
        this.backdoorExist = backdoorExist;
        this.plugExist = plugExist;
        this.roomKind = roomKind;
    }

    public static ClassInfoDialogFragment getInstance(String roomName, boolean backdoorExist, boolean plugExist, int roomKind) {
        ClassInfoDialogFragment e = new ClassInfoDialogFragment(roomName, backdoorExist, plugExist, roomKind);
        return e;
    }

    TextView roomNumberTextView, backdoorTextview, plugTextView, roomKindTextView;
    ImageView backdoorImageView, plugImageView, roomKindImageView;
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.classroom_information, null);

        roomNumberTextView = (TextView) view.findViewById(R.id.roomNumber); // 텍스트들 가져오기
        backdoorTextview = (TextView) view.findViewById(R.id.backdoorText);
        plugTextView = (TextView) view.findViewById(R.id.plugText);
        roomKindTextView = (TextView) view.findViewById(R.id.kindText);

        backdoorImageView = (ImageView) view.findViewById(R.id.backdoorImage); // 이미지들 가져오기
        plugImageView = (ImageView) view.findViewById(R.id.plugImage);
        roomKindImageView = (ImageView) view.findViewById(R.id.kindImage);

        roomNumberTextView.setText(roomName); // 강의실 이름 설정

        // 문 설정
        if (backdoorExist) {
            backdoorTextview.setText("문이 여러 개예요");
            backdoorImageView.setImageResource(R.drawable.ic_classroom_backdoor_existed);
        } else {
            backdoorTextview.setText("문이 하나예요");
            backdoorImageView.setImageResource(R.drawable.ic_classroom_backdoor_absence);
        }

        // 플러그 유무
        if (plugExist){
            plugTextView.setText("콘센트가 있어요");
            plugImageView.setImageResource(R.drawable.ic_classroom_plug_existed);
        } else {
            plugTextView.setText("콘센트가 없어요");
            plugImageView.setImageResource(R.drawable.ic_classroom_plug_absence);
        }

        // 강의실 형태
        if (roomKind == 0) { // 교실형
            roomKindTextView.setText("일반책상강의실이에요");
            roomKindImageView.setImageResource(R.drawable.ic_classroom_table);
        } else if (roomKind == 1) { // 계단형
            roomKindTextView.setText("계단강의실이에요");
            roomKindImageView.setImageResource(R.drawable.ic_classroom_stair);
        } else if (roomKind == 2) { // 조별책상형
            roomKindTextView.setText("조별책상강의실이에요");
            roomKindImageView.setImageResource(R.drawable.ic_classroom_grouptable);
        }

        return builder.create();
    }
}

