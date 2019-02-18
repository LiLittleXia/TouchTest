package com.lz.touchtest.viewgroup;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2019/2/18.
 */

public class EventViewGroupB extends LinearLayout {
    private static final String TAG = "EventViewGroupB";

    public EventViewGroupB(Context context) {
        super(context);
    }

    public EventViewGroupB(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public EventViewGroupB(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("lz", "------------------------onTouchEvent:------------------------viewgroupB ");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("lz", "------------------------dispatchTouchEvent:------------------------viewgroupB ");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("lz", "------------------------onInterceptTouchEvent:------------------------viewgroupB ");
        return super.onInterceptTouchEvent(ev);
    }
}
