package com.lz.touchtest.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2019/2/18.
 */

public class EventViewA extends View{
    private static final String TAG = "EventViewA";

    public EventViewA(Context context) {
        super(context);
    }

    public EventViewA(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public EventViewA(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("lz", "------------------------onTouchEvent:------------------------viewA ");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("lz", "------------------------dispatchTouchEvent:------------------------viewA ");
        return super.dispatchTouchEvent(event);
    }
}
