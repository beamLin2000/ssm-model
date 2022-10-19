package com.gxa.entity.systemSettings;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("payment_method")
public class PaymentMethod {
    @ApiModelProperty(value = "id",name = "id",required = false)
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    @ApiModelProperty(value = "paymentMethod",name = "支付方式",required = false)
    @TableField("paymentMethod")
    private String paymentMethod;
    @ApiModelProperty(value = "state",name = "状态",required = false)
    @TableField("state")
    private String state;
}
