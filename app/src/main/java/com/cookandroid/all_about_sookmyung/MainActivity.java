package com.cookandroid.all_about_sookmyung;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    final String TAG = this.getClass().getSimpleName();

    LinearLayout home_ly;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "");

        init();
        SettingListener();

        bottomNavigationView.setSelectedItemId(R.id.home);
    }

    private void init() {
        home_ly = findViewById(R.id.home_ly);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
    }

    private void SettingListener() {
        // 선택 리스너 등록
        bottomNavigationView.setOnNavigationItemSelectedListener(new TabSelectedListener());
    }

    class TabSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener {
        Fragment MainFrag, MapFrag, MenuFrag;

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.tab_home: {
                    if (MainFrag == null) {
                        MainFrag = new HomeFragment();
                        getSupportFragmentManager().beginTransaction().add(R.id.home_ly, MainFrag).commit();
                    }

                    if (MainFrag != null) getSupportFragmentManager().beginTransaction().show(MainFrag).commit();
                    if (MapFrag != null) getSupportFragmentManager().beginTransaction().hide(MapFrag).commit();
                    if (MenuFrag != null) getSupportFragmentManager().beginTransaction().hide(MenuFrag).commit();
                    return true;
                }
                case R.id.tab_map: {
                    if (MapFrag == null) {
                        MapFrag = new MapFragment();
                        getSupportFragmentManager().beginTransaction().add(R.id.home_ly, MapFrag).commit();
                    }

                    if (MainFrag != null) getSupportFragmentManager().beginTransaction().hide(MainFrag).commit();
                    if (MapFrag != null) getSupportFragmentManager().beginTransaction().show(MapFrag).commit();
                    if (MenuFrag != null) getSupportFragmentManager().beginTransaction().hide(MenuFrag).commit();
                    return true;
                }
                case R.id.tab_menu: {
                    if (MenuFrag == null) {
                        MenuFrag = new MenuFragment();
                        getSupportFragmentManager().beginTransaction().add(R.id.home_ly, MenuFrag).commit();
                    }

                    if (MainFrag != null) getSupportFragmentManager().beginTransaction().hide(MainFrag).commit();
                    if (MapFrag != null) getSupportFragmentManager().beginTransaction().hide(MapFrag).commit();
                    if (MenuFrag != null) getSupportFragmentManager().beginTransaction().show(MenuFrag).commit();
                    return true;
                }
            }
            return false;
        }
    }
}