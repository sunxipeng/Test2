package com.sunxipeng.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findViewById(R.id.bt).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        String pat1 = "yyyy-MM-dd HH:mm:ss";

        String a = "2015-12-17T12:13:11";

        a = a.replaceAll("T", " ");

        SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);

        Date b = null;
        try {

            b = sdf1.parse(a);

        } catch (ParseException e) {

            e.printStackTrace();
        }

        Date nowdate = new Date();


        Toast.makeText(this,b.getTime()+"",Toast.LENGTH_SHORT).show();

        Toast.makeText(this,nowdate.getTime()+"",Toast.LENGTH_SHORT).show();

        Toast.makeText(this,TimeTransTools.getDifference(b.getTime() - nowdate.getTime()),Toast.LENGTH_SHORT).show();

    }
}
