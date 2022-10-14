package com.gxa.utils.systemSettings;


import com.gxa.entity.systemSettings.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private int code;
    private String msg;
    private int count;
    private Object date;

    public Result(int code, String msg, Object date) {
        this.code = code;
        this.msg = msg;
        this.date = date;
    }
}
