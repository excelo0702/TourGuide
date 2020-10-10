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
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import static com.google.android.material.bottomnavigation.BottomNavigationView.*;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
       // getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new HomeFragment()).commit();
        /*navView.setOnNavigationItemSelectedListener(
                new OnNavigationItemSelectedListener() {
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
                      //  getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,
                              //  selectedFragment).commit();
                        return true;
                    }

                });*/
    }


}