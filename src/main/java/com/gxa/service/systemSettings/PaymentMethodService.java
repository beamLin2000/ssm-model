package com.gxa.service.systemSettings;

import com.gxa.entity.systemSettings.PaymentMethod;
import com.gxa.form.systemSettings.CostSettngsForm.PaymentMethodForm;

import java.util.List;


public interface PaymentMethodService{
    List<PaymentMethod>queryAll();
    void updateByState(PaymentMethodForm paymentMethodForm);
}
