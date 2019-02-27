package com.king.live.bean;

/**
 * 项目名：KingLive
 * 包名：com.king.live.bean
 * 创建者：guan_qi
 * 创建日期：2019/2/25 11:09
 * 邮箱：guan_qi@hoperun.com
 * 描述：
 */
public class RoomInfo {
    private int roomId;
    private String roomSrc;
    private String roomName;

    private String nickname;
    private int online;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomSrc() {
        return roomSrc;
    }

    public void setRoomSrc(String roomSrc) {
        this.roomSrc = roomSrc;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
    }

    @Override
    public String toString() {
        return "RoomInfo [roomId=" + roomId + ", roomSrc=" + roomSrc + ", roomName=" + roomName
                + ", nickname=" + nickname + ", online=" + online + "]";
    }
}
