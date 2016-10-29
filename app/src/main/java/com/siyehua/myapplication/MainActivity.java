package com.siyehua.myapplication;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.siyehua.androidlib.LibStringUtils;
import com.siyehua.base.BaseActivity;
import com.siyehua.yewu1.YeWu1Activity;

public class MainActivity extends BaseActivity {
    TextView abc;
    View yewu2;

    @Override
    public void findView() {
        int tmp = com.siyehua.myapplication.R.layout.activity_main;
        Log.e("siyehua-main", tmp + "");
        setContentView(tmp);
        abc = (TextView) findViewById(R.id.tv_data);
        yewu2 = findViewById(R.id.button2);
    }

    @Override
    public void init() {
        abc.setText(LibStringUtils.printString("来自Lib的数据"));
    }

    @Override
    public void setOnClick() {
        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, YeWu1Activity.class));
            }
        });
        yewu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, com.siyehua.yewu2.MainActivity.class));
            }
        });
    }
}
