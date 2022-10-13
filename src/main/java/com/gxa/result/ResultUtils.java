package com.gxa.result;

/**
 * @Author LXD
 * @Date 2022/10/11 20:57
 * @Version 1.0
 */
public class ResultUtils {
    public static Result buildFail(Integer code,String msg,Long count,Object data){
        Result<Object> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setCount(count);
        result.setData(data);
        return result;
    }
}
