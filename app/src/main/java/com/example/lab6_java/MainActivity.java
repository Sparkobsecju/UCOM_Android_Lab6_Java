package com.example.lab6_java;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab);
        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;
        intent = new Intent().setClass(this, Activity1.class);
        spec = tabHost.newTabSpec("Activity1")
                .setIndicator("Activity1", null)
                .setContent(intent);
        tabHost.addTab(spec);
        intent = new Intent().setClass(this, Activity2.class);
        spec = tabHost.newTabSpec("Activity2")
                .setIndicator("Activity2", null)
                .setContent(intent);
        tabHost.addTab(spec);
        intent = new Intent().setClass(this, Activity3.class);
        spec = tabHost.newTabSpec("Activity3")
                .setIndicator("Activity3", null)
                .setContent(intent);
        tabHost.addTab(spec);
        intent = new Intent().setClass(this, Activity4.class);
        spec = tabHost.newTabSpec("Activity4")
                .setIndicator("Activity4", null)
                .setContent(intent);
        tabHost.addTab(spec);
    }
}