package com.cookandroid.all_about_sookmyung;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ElseInfoDialogFragment extends androidx.fragment.app.DialogFragment {
    String roomNumber, roomName; // 시설 이름
    TextView roomNumberTextView, roomNameTextView;
    ImageButton exitBtn;

    public ElseInfoDialogFragment (String roomNumber, String roomName) {
        this.roomNumber = roomNumber;
        this.roomName = roomName;
    }

    public static ElseInfoDialogFragment getInstance(String roomNumber, String roomName) {
        ElseInfoDialogFragment e = new ElseInfoDialogFragment(roomNumber, roomName);
        e.setStyle(STYLE_NO_TITLE, R.style.NewDialog);
        return e;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.else_information, null);

        roomNumberTextView = (TextView) view.findViewById(R.id.roomNumber);
        roomNumberTextView.setText(roomNumber);

        roomNameTextView = (TextView) view.findViewById(R.id.roomName);
        roomNameTextView.setText(roomName); // 강의실 이름 설정

        exitBtn = (ImageButton) view.findViewById(R.id.exitBtn);
        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        return view;
    }
}
