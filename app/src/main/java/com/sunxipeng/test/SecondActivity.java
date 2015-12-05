package com.sunxipeng.test;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Administrator on 2015/12/5.
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        String str = (String) getIntent().getExtras().get("test");
    }


}
