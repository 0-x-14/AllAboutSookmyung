package com.cookandroid.all_about_sookmyung;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MenuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ArrayAdapter<String> adapter;

    // 스피너 관련
    private Spinner spinner;
    //private int spinnerSelection = 0;
    static final String STU_ROOM = "과방", DEP_OFF = "과사", LOC = "사물함";
    TextView student_room, department_office, locker;
    String[] student_room_list = { "명신관324", "명신관220b", "명신관219", "-", "-", "명신관323", "명신관623b", "르네상스B207 (지하 2층)", "르네상스B209B", "순헌관508b",
                                "명신관312b", "순헌관510a", "명신관321a", "명신관220a", "(추후 업데이트)", "순헌관414b", "(추후 업데이트)", "(추후 업데이트)", "-", "명신관623c",
                                "명신관311a", "(추후 업데이트)", "(추후 업데이트)", "명신관208b", "(추후 업데이트)", "명신관324", "명신관623b", "(추후 업데이트)", "순헌관508a",
                                "명신관311b", "순헌관510b", "명신관504", "순헌관508d", "-", "명신관218a", "순헌관508c", "(추후 업데이트)", "명신관312a", "명신관311b",
                                "(추후 업데이트)", "순헌관508b", "-", "명신관208a", "순헌관 지하", "명신관623a", "과학관451", "과학관260", "(추후 업데이트)", "(추후 업데이트)" };
    String[] department_office_list = { "순헌관323", "순헌관316A", "순헌관315", "미술대210", "음대201", "순헌관921", "백주년기념관512", "르네상스플라자 501", "르네상스플라자 501",
                                        "순헌관316B", "진리관302", "순헌관220", "새힘관205", "새힘관201", "진리관209", "순헌관721", "미술대210", "과학관101", "음대201",
                                        "순헌관312", "명신관425", "사회교육관416", "미술대210", "순헌관323", "과학관209", "순헌관323", "백주년기념관512", "(추후 업데이트)",
                                        "순헌관412", "진리관303", "순헌관323", "명신관513", "순헌관602", "음대201", "순헌관313", "순헌관311", "르네상스플라자 501", "진리관304",
                                        "진리관303", "사회교육관512", "순헌관314", "음대201", "순헌관411", "순헌관313", "순헌관312", "과학관463", "과학관101", "미술대210", "미술대210" };

    // 사물함
    EditText editLocker;
    View dialogView;

    View v;

    public MenuFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MenuFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MenuFragment newInstance(String param1, String param2) {
        MenuFragment fragment = new MenuFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState, View inflater) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    /*@Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        String studentRoomStr, departmentOfficeStr, lockerStr;
        studentRoomStr = student_room.getText().toString();
        departmentOfficeStr = department_office.getText().toString();
        lockerStr = locker.getText().toString();
        outState.putString(STU_ROOM, studentRoomStr);
        outState.putString(DEP_OFF, departmentOfficeStr);
        outState.putString(LOC, lockerStr);
    }*/

    @Override
    public void onDestroy() {
        super.onDestroy();

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("myPage", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.clear();
        editor.commit();

        String valLocker = locker.getText().toString();
        int valSpinner = spinner.getSelectedItemPosition();
        editor.putString("locker", valLocker);
        editor.putInt("position", valSpinner);
        editor.commit();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_menu, container, false);

        Button majorbutton2 = (Button) v.findViewById(R.id.majorbutton2);
        majorbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MajorActivity.class);
                startActivity(intent);
            }
        });
        // majorbutton을 누르면 학과정보 페이지로 넘어감

        Button plugbutton = (Button) v.findViewById(R.id.plugbutton);
        plugbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PlugActivity.class);
                startActivity(intent);
            }
        });
        // plugbutton을 누르면 콘센트 페이지로 넘어감

        return v;

        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        student_room = (TextView) view.findViewById(R.id.studentRoom);
        department_office = (TextView) view.findViewById(R.id.departmentOffice);
        locker = (TextView) view.findViewById(R.id.locker);

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("myPage", Context.MODE_PRIVATE);
        String valLocker = sharedPreferences.getString("locker", "(사물함 정보)");
        locker.setText(valLocker);

        Button studyroombutton=(Button) view.findViewById(R.id.studyroombutton);
        Button padspotbutton=(Button) view.findViewById(R.id.padspotbutton);
        Button foodspotbutton=(Button) view.findViewById(R.id.foodspotbutton);

        /*if (savedInstanceState != null) {
            String studentRoomStr, departmentOfficeStr, lockerStr;
            studentRoomStr = savedInstanceState.getString(STU_ROOM);
            departmentOfficeStr = savedInstanceState.getString(DEP_OFF);
            lockerStr = savedInstanceState.getString(LOC);

            student_room.setText(studentRoomStr);
            department_office.setText(departmentOfficeStr);
            locker.setText(lockerStr);
        }*/

        spinner = (Spinner) view.findViewById(R.id.spinner);
        int valPosition = sharedPreferences.getInt("position", 0);
        spinner.setSelection(valPosition);

        ArrayAdapter departmentAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.department_spinner_array, android.R.layout.simple_spinner_dropdown_item);
        departmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(departmentAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                student_room.setText(student_room_list[position]);
                department_office.setText(department_office_list[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });

        Button lockerSetBtn = (Button) view.findViewById(R.id.lockerSetButton);
        lockerSetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment dialogFragment = DialogFragment.newInstance(new DialogFragment.NameInputListener() {
                    @Override
                    public void onNameInputComplete(String name) {
                        if (name != null){
                            locker.setText(name);
                        }
                    }
                });
                dialogFragment.show(getFragmentManager(), "사물함");
            }
        });


        studyroombutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), StudyroomActivity.class);
                startActivity(intent);
            }
        });
        padspotbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),PadspotActivity.class);
                startActivity(intent);
            }
        });
        foodspotbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),FoodspotActivity.class);
                startActivity(intent);
            }
        });

        return view;
        //return inflater.inflate(R.layout.fragment_menu, container, false);
    }

}