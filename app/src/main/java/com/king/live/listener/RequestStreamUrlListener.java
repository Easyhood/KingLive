package com.king.live.listener;

/**
 * 项目名：KingLive
 * 包名：com.king.live.listener
 * 创建者：guan_qi
 * 创建日期：2019/2/25 11:33
 * 邮箱：guan_qi@hoperun.com
 * 描述：
 */
public interface RequestStreamUrlListener {
    void onSuccess(int roomId, String url);
    void onError();
}
