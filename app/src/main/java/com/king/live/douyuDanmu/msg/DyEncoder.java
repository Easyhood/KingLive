package com.king.live.douyuDanmu.msg;

/**
 * 项目名：KingLive
 * 包名：com.king.live.douyuDanmu.msg
 * 创建者：guan_qi
 * 创建日期：2019/2/24 17:13
 * 邮箱：guan_qi@hoperun.com
 * 描述：弹幕格式化
 */
public class DyEncoder {
    private StringBuffer buf = new StringBuffer();

    /**
     * 返回弹幕协议格式化后的结果
     * @return
     */
    public String getResult()
    {
        //数据包末尾必须以'\0'结尾
        buf.append('\0');
        return buf.toString();
    }

    /**
     * 添加协议参数项
     * @param key
     * @param value
     */
    public void addItem(String key, Object value)
    {
        //根据斗鱼弹幕协议进行相应的编码处理
        buf.append(key.replaceAll("/", "@S").replaceAll("@", "@A"));
        buf.append("@=");
        if(value instanceof String){
            buf.append(((String)value).replaceAll("/", "@S").replaceAll("@", "@A"));
        }else if(value instanceof Integer){
            buf.append(value);
        }
        buf.append("/");
    }
}
