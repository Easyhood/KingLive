package com.king.live.listener;

import com.king.live.bean.SubChannelInfo;

import java.util.List;

/**
 * 项目名：KingLive
 * 包名：com.king.live.listener
 * 创建者：guan_qi
 * 创建日期：2019/2/25 10:58
 * 邮箱：guan_qi@hoperun.com
 * 描述：
 */
public interface RequestSubChannelListener {
    void onSuccess(List<SubChannelInfo> subChannelInfos);
    void onError();
}
