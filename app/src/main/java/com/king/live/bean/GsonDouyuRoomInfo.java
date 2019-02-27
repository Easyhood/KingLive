package com.king.live.bean;

import java.util.List;

/**
 * 项目名：KingLive
 * 包名：com.king.live.bean
 * 创建者：guan_qi
 * 创建日期：2019/2/25 11:05
 * 邮箱：guan_qi@hoperun.com
 * 描述：
 */
public class GsonDouyuRoomInfo {
    private int error;

    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public static class Data {
        private List<GsonSubChannel.Room> room;

        public List<GsonSubChannel.Room> getRoom() {
            return room;
        }
    }
}
