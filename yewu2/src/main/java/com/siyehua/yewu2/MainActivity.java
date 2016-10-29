package com.siyehua.yewu2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int tmp = com.siyehua.yewu2.R.layout.activity_yewu2;
        Log.e("siyehua-yewu2", tmp + "");
        setContentView(tmp);
    }
}
