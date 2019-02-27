package com.king.live.ui;

import android.os.Bundle;

import com.king.live.R;

public class MainActivity extends BaseActivity {

    private final String mTabSpec[] = {"head", "classify", "heart", "search"};

    private final String mIndicator[] = {"首页","分类","喜欢","搜索"};

    //TODO




    private final int mTabImage[] = {
            R.drawable.tab_home_item,
            R.drawable.tab_classify_item,
            R.drawable.tab_heart_item,
            R.drawable.tab_user_item
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
