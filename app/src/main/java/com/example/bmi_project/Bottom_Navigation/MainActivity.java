package com.example.bmi_project.Bottom_Navigation;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.bmi_project.Fragment_Layout.CallsFragment;
import com.example.bmi_project.Fragment_Layout.ChatsFragment;
import com.example.bmi_project.Fragment_Layout.logsFragment;
import com.example.bmi_project.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottom_navigation;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);


        bottom_navigation = findViewById(R.id.bottom_navigation);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.color_primary));


        loadFragment(new CallsFragment());
        bottom_navigation.setSelectedItemId(R.id.calls);


        bottom_navigation.setOnItemSelectedListener(menuItem -> {
            Fragment showFragment = null;

            int id = menuItem.getItemId();
            if (id == R.id.chats) {
                showFragment = new ChatsFragment();

            } else if (id == R.id.calls) {
                showFragment = new CallsFragment();

            } else if (id == R.id.logs) {

                showFragment = new logsFragment();

            }

            if (showFragment != null) {
                loadFragment(showFragment);

            }
            return true;

        });


    }


    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
//        transaction.addToBackStack(null);
        transaction.commit();
    }
}