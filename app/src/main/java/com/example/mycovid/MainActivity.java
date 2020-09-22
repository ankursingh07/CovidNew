package com.example.mycovid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private static final String TAG="Mainaactivity";
    private NavigationView NavView;
    private DrawerLayout DLayout;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,DLayout,toolbar,R.string.drawer_open,R.string.drawer_close);
        DLayout.addDrawerListener(toggle);
        toggle.syncState();
    }
    private void initViews() {
        Log.i(TAG,"Init View:started");
        NavView = (NavigationView) findViewById(R.id.navigation_view);
        DLayout = (DrawerLayout) findViewById(R.id.drawer);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        NavView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId()) {
            case R.id.item1:
                            Intent intent = new Intent(this,Bedstat.class);
                            startActivity(intent);
                            break;

            case R.id.item2:
                            Intent intent1 = new Intent(this,Login.class);
                            startActivity(intent1);
                            break;

            case R.id.item3:
                Intent intent2 = new Intent(this,Mystat.class);
                startActivity(intent2);
                break;

            case R.id.item4:
                Intent intent3 = new Intent(this,ContactUs.class);
                startActivity(intent3);
                break;


        }
        return true;
    }
}
