package com.xxx.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean {

    private long code;
    private String msg;
    private Object data;
    private Integer count;

    /**
     * 成功返回结果
     * @param msg
     * @return
     */
    public static RespBean success(String msg) {
        return new RespBean(200, msg, null, 0);
    }

    /**
     * 成功返回结果
     * @param msg
     * @param data
     * @return
     */
    public static RespBean success(String msg, Object data) {
        return new RespBean(200, msg, data, 0);
    }

    /**
     * 成功反回数据结果
     * @param msg
     * @param data
     * @param count
     * @return
     */
    public static RespBean success(String msg, Object data, Integer count) {
        return new RespBean(200, msg, data, count);
    }

    /**
     * 失败返回结果
     * @param msg
     * @return
     */
    public static RespBean error(String msg){
        return new RespBean(500, msg, null,0);
    }

    /**
     * 失败返回结果
     * @param msg
     * @param data
     * @return
     */
    public static RespBean error(String msg, Object data){
        return new RespBean(500, msg, data,0);
    }

}
