package com.king.live.bean;

/**
 * 项目名：KingLive
 * 包名：com.king.live.bean
 * 创建者：guan_qi
 * 创建日期：2019/2/25 11:04
 * 邮箱：guan_qi@hoperun.com
 * 描述：
 */
public class GsonDouyuRoom {
    private int error;
    private Data data;

    public int getError() {
        return error;
    }

    public Data getData() {
        return data;
    }

    public static class Data {
        private int room_id;
        private String hls_url;

        public int getRoom_id() {
            return room_id;
        }

        public String getHls_url() {
            return hls_url;
        }

        @Override
        public String toString() {
            return "GsonDouyuRoom [room_id=" + room_id + ", hls_url" + hls_url + "]";
        }
    }
}
