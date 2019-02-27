package com.king.live.utils;

import java.util.HashMap;

/**
 * 项目名：KingLive
 * 包名：com.king.live.utils
 * 创建者：guan_qi
 * 创建日期：2019/2/24 17:01
 * 邮箱：guan_qi@hoperun.com
 * 描述：Url建设类
 */
public class BuildUrl {
    public static final String DOUYU_API = "http://capi.douyucdn.cn/api/v1/";

    public static String getDouyuLOLSubChannel() {
        return DOUYU_API + "live/1?&limit=20";
    }

    public static String getDouyuPlayerUnknowChannel() {
        return DOUYU_API + "live/270?&limit=20";
    }

    public static String getDouyuDota2SubChannel() {
        return DOUYU_API + "live/3?&limit=20";
    }

    public static String getDouyuAllSubChannels() {
        return DOUYU_API + "getColumnDetail?shortName=game";
    }

    public static String getDouyuLiveChannel() {
        return DOUYU_API + "live?&limit=20";
    }

    public static String getDouyuSubChannelBaseTag(int channelTag) {
        return DOUYU_API + "live/" + channelTag + "?&limit=20";
    }

    public static String getDouyuRoom(int roomId) {
        return "http://capi.douyucdn.cn/api/v1/searchNew/" + roomId + "/1?limit=1&offset=0";
    }

    public static String getDouyuRoomUrl(int roomId) {
        return "https://m.douyu.com/html5/live?roomId=" + roomId;
    }

    public static HashMap<String, String> getDouyuRoomParams(int roomId) {
        int time = (int) (System.currentTimeMillis() / 1000);
        String signContent = "lapi/live/thirdPart/getPlay/" + roomId + "?aid=pcclient&rate=0&time="
                + time + "9TUk5fjjUjg9qIMH3sdnh";
        String sign = Md5.strToMd5Low32(signContent);

        HashMap<String, String> map = new HashMap<>();
        map.put("auth", sign);
        map.put("time", "" + time);
        map.put("aid", "pcclient");

        return map;
    }
    public static String getDouyuSearchUrl(String keyWord) {
        return "http://capi.douyucdn.cn/api/v1/mobileSearch/1/1?sk=" + keyWord +
                "&limit=10&client_sys=android";
    }
}
