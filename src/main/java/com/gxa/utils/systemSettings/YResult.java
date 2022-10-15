package com.gxa.utils.systemSettings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class YResult {
    private Integer code;
    private String msg ;
    private Object data;


    public YResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;

    }


}
