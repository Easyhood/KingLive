package com.king.live.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class SquarelinerLayout extends LinearLayout {

    public SquarelinerLayout(Context context) {
        super(context);
    }

    public SquarelinerLayout(Context context,  AttributeSet attrs) {
        super(context, attrs);
    }

    public SquarelinerLayout(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SquarelinerLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(getDefaultSize(0,widthMeasureSpec),getDefaultSize(0,heightMeasureSpec));
        int childWidthSize = getMeasuredWidth();
        heightMeasureSpec = widthMeasureSpec = MeasureSpec.makeMeasureSpec(
                childWidthSize,MeasureSpec.EXACTLY
        );

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }
}
