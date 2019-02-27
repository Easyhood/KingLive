package com.king.live.utils;

import android.view.View;

/**
 * 项目名：KingLive
 * 包名：com.king.live.utils
 * 创建者：guan_qi
 * 创建日期：2019/2/24 16:57
 * 邮箱：guan_qi@hoperun.com
 * 描述：适配器接口
 */
public interface AdapterCallback {
    void onItemClick(View view, int position);
    void onItemLongClick(View view, int position);
    void onPositionChanged(int position);
}
