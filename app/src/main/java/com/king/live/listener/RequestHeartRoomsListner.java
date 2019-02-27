package com.king.live.listener;

import com.king.live.bean.RoomInfo;

/**
 * 项目名：KingLive
 * 包名：com.king.live.listener
 * 创建者：guan_qi
 * 创建日期：2019/2/25 14:52
 * 邮箱：guan_qi@hoperun.com
 * 描述：
 */
public interface RequestHeartRoomsListner {
    void onSuccess(RoomInfo roomInfo);
    void onError();
}
