package com.gxa.mapper.systemSettings;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.systemSettings.PaymentMethod;
import com.gxa.form.systemSettings.CostSettngsForm.PaymentMethodForm;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaymentMethodMapper  {
    List<PaymentMethod>queryAll();
    void updateByState(PaymentMethodForm paymentMethodForm);

}
