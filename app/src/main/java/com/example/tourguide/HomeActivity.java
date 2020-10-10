package com.example.tourguide;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.tourguide.ui.dashboard.DashboardFragment;
import com.example.tourguide.ui.home.HomeFragment;
import com.example.tourguide.ui.notifications.NotificationsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        getSupportFragmentManager().beginTransaction().replace(R.id.home_activity_fragment,new HomeFragment()).commit();
        navView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment=null;

                        switch (item.getItemId()){
                            case R.id.navigation_dashboard:
                                selectedFragment=new DashboardFragment();
                                break;
                            case R.id.navigation_notifications:
                                selectedFragment=new NotificationsFragment();
                                break;
                            case R.id.navigation_home:
                                selectedFragment=new HomeFragment();
                                break;

                        }
                        getSupportFragmentManager().beginTransaction().replace(R.id.home_activity_fragment,
                                selectedFragment).commit();
                        return true;
                    }

                });
    }


}