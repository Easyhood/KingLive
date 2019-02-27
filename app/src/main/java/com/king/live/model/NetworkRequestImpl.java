package com.king.live.model;

import com.king.live.listener.NetworkRequest;
import com.king.live.listener.RequestAllSubChannelsListener;
import com.king.live.listener.RequestHeartRoomsListner;
import com.king.live.listener.RequestStreamUrlListener;

/**
 * 项目名：KingLive
 * 包名：com.king.live.model
 * 创建者：guan_qi
 * 创建日期：2019/2/25 15:07
 * 邮箱：guan_qi@hoperun.com
 * 描述：TODO
 */
public class NetworkRequestImpl implements NetworkRequest {



    @Override
    public void getSubChannel(String url, RequestAllSubChannelsListener listener) {

    }

    @Override
    public void getStreamUrl(int roomId, RequestStreamUrlListener listener) {

    }

    @Override
    public void getAllSubChannels(RequestAllSubChannelsListener listener) {

    }

    @Override
    public void getHeartRooms(RequestHeartRoomsListner listner) {

    }
}
