package com.king.live.bean;

import java.util.List;

/**
 * 项目名：KingLive
 * 包名：com.king.live.bean
 * 创建者：guan_qi
 * 创建日期：2019/2/25 11:06
 * 邮箱：guan_qi@hoperun.com
 * 描述：
 */
public class GsonSubChannel {

    private List<Room> data;

    public List<Room> getData() {
        return data;
    }

    public static class Room {
        private int room_id;
        private String room_src;
        private String roomSrc;
        private String room_name;
        private String nickname;
        private int online;
        public int getRoom_id() {
            return room_id;
        }

        public String getRoom_src() {
            return room_src;
        }

        public String getRoomSrc() {
            return roomSrc;
        }

        public String getRoom_name() {
            return room_name;
        }

        public String getNickname() {
            return nickname;
        }

        public int getOnline() {
            return online;
        }

        @Override
        public String toString() {
            return "Room [room_id=" + room_id + ", room_src=" + room_src + ", roomSrc=" + roomSrc +
                    ", room_name=" + room_name + ", nickname=" + nickname +
                    ", setOnline=" + online + "]";
        }
    }

    @Override
    public String toString() {
        return "GsonSubChannel [data=" + data + "]";
    }
}
