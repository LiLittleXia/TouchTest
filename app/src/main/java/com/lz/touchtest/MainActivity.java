package com.lz.touchtest;

import android.os.LocaleList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lz.touchtest.view.EventViewA;
import com.lz.touchtest.view.EventViewB;
import com.lz.touchtest.viewgroup.EventViewGroupA;
import com.lz.touchtest.viewgroup.EventViewGroupB;

public class MainActivity extends AppCompatActivity {

    //事件分发流程图 https://upload-images.jianshu.io/upload_images/2200042-f50e36018fdf17f7.png?imageMogr2/auto-orient/


    //dispatch  [dɪˈspætʃ]
    //Intercept     [ˌɪntəˈsept]


    private static final String TAG = "MainActivity";
    private EventViewA eventViewA;
    private EventViewB eventViewB;
    private EventViewGroupA eventViewGroupA;
    private EventViewGroupB eventViewGroupB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventViewA = findViewById(R.id.ev_a);
        eventViewB = findViewById(R.id.ev_b);
        eventViewGroupA = findViewById(R.id.evg_a);
        eventViewGroupB = findViewById(R.id.evg_b);

        eventViewA.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d("lz", "------------------------onTouch:------------------------eventViewA ");
                return true;
            }
        });

        eventViewB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("lz", "------------------------onClick:------------------------eventViewB ");
            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("lz", "------------------------dispatchTouchEvent:------------------------MainActivity ");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("lz", "------------------------onTouchEvent:------------------------MainActivity ");
        return super.onTouchEvent(event);
    }
}
