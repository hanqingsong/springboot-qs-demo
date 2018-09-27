package cn.qingsong.springbootswagger2.result;

import java.util.Map;

/**
 * Created by hanqingsong on 18/9/27.
 *
 * @author hanqingsong
 * @date 18/9/27
 */
public class WebResponse {
    Integer code;
    String msg;
    Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
