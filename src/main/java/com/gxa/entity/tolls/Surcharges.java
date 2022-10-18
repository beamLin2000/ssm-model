package com.gxa.entity.tolls;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "surcharges")
public class Surcharges {

    private String name;
    private Double price;
    private String tollNumber;

}
