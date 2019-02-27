package com.king.live.listener;

/**
 * 项目名：KingLive
 * 包名：com.king.live.listener
 * 创建者：guan_qi
 * 创建日期：2019/2/25 14:57
 * 邮箱：guan_qi@hoperun.com
 * 描述：
 */
public interface NetworkRequest {
    void getSubChannel(String url, RequestAllSubChannelsListener listener);

    void getStreamUrl(int roomId, RequestStreamUrlListener listener);

    void getAllSubChannels(RequestAllSubChannelsListener listener);

    void getHeartRooms(RequestHeartRoomsListner listner);
}
