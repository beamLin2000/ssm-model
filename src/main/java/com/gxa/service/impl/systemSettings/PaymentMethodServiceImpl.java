package com.gxa.service.impl.systemSettings;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.gxa.entity.systemSettings.PaymentMethod;
import com.gxa.form.systemSettings.CostSettngsForm.PaymentMethodForm;
import com.gxa.mapper.systemSettings.PaymentMethodMapper;
import com.gxa.service.systemSettings.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {

    @Autowired
    private PaymentMethodMapper paymentMethodMapper;


    @Override
    public List<PaymentMethod> queryAll() {
        List<PaymentMethod> paymentMethods = this.paymentMethodMapper.queryAll();
        return paymentMethods;
    }

    @Override
    public void updateByState(PaymentMethodForm paymentMethodForm) {
        this.paymentMethodMapper.updateByState(paymentMethodForm);
    }


}
