package com.cookandroid.all_about_sookmyung;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DialogFragment extends androidx.fragment.app.DialogFragment {
    /*public DialogFragment() { }
    public static DialogFragment getInstance() {
        DialogFragment e = new DialogFragment();
        return e;
    }*/
    private EditText mName;
    private NameInputListener listener;

    public static DialogFragment newInstance(NameInputListener listener) {
        DialogFragment fragment = new DialogFragment();
        fragment.listener = listener;
        return fragment;
    }

    public interface NameInputListener {
        void onNameInputComplete(String name);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.set_locker, null);
        mName = (EditText)view.findViewById(R.id.editLocker);
        builder.setView(view)
                .setPositiveButton("확인",
                        new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int id)
                            {
                                listener.onNameInputComplete(mName.getText().toString());
                            }
                        }).setNegativeButton("취소", null);
        return builder.create();
    }

/*
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.set_locker,container);
        EditText editLocker = (EditText) v.findViewById(R.id.editLocker);
        Button btnEnter = (Button) v.findViewById(R.id.btnEnter);
        Button btnCancel = (Button) v.findViewById(R.id.btnCancel);
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 콜백
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        return v;

    }*/

}