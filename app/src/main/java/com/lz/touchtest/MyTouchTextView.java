package com.lz.touchtest;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;


/**
 * Created by Administrator on 2019/2/18.
 */

public class MyTouchTextView extends android.support.v7.widget.AppCompatTextView {
    private static final String TAG = "MyTouchTextView";

    public MyTouchTextView(Context context) {
        super(context);
    }

    public MyTouchTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTouchTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        switch (event.getAction()){
//            case MotionEvent.ACTION_DOWN:
//                Log.d(TAG, "tv-ACTION_DOWN");
//                break;
//            case MotionEvent.ACTION_MOVE:
//                Log.d(TAG, "tv-ACTION_MOVE");
//                break;
//            case MotionEvent.ACTION_UP:
//                Log.d(TAG, "tv-ACTION_UP");
//                break;
//        }
//        return true;
//    }
}
