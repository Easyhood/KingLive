package com.king.live.douyuDanmu.utils;

import com.king.live.douyuDanmu.client.DyBulletScreenClient;

public class KeepAlive extends Thread {
    @Override
    public void run() {

        //获取弹幕客户端
        DyBulletScreenClient danmuClient = DyBulletScreenClient.getInstance();

        //判断客户端就绪状态
        while (danmuClient.getReadyFlag()){

            //发送心跳保持协议给服务器端
            danmuClient.keepAlive();
            try {
                //设置隔45秒再发送心跳协议
                Thread.sleep(45000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
