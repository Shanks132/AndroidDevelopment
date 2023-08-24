package com.example.ch3_activitiesandlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
/*
NOTES:
Activities can simply be the focused screen seen by the user
Activity has layouts:
eg: WebView TextView Mail passwords etc
So we wil see how each one is presented on the screen

Layout determine how views are displayed

Types Of layouts : many Types go xml design and check them out

most important would be constraint and linear
Linear : arranges collection of views in a straight horizontal
or vertical row  : can be horizontal or vertical

 Caution : make sure that image size is not too large use snips if that is the case
dp = density independent pixels


 */