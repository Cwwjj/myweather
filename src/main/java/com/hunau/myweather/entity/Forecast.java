package com.hunau.myweather.entity;

/**
 * @param
 * @Description:
 * @Return:
 * @Author: 蔡文静
 * @单位：湖南农业大学物联网工程专业
 * @Date:
 * @开发版本：综合练习VO.1
 */
import lombok.Data;

import java.io.Serializable;

/**
 * 未来天气

 */
@Data
public class Forecast implements Serializable {



    /**
     * 日期
     */
    private String date;

    /**
     * 高温
     */
    private String high;

    /**
     * 风向
     */
    private String fengxiang;

    /**
     * 低温
     */
    private String low;

    /**
     * 风力
     */
    private String fengli;

    /**
     * 类型：大雨、阵雨、多云
     */
    private String type;
}
