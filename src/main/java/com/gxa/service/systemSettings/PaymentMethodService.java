package com.gxa.service.systemSettings;

import com.gxa.entity.systemSettings.PaymentMethod;

import java.util.List;

public interface PaymentMethodService {
    List<PaymentMethod>queryAll();
    void updateById(PaymentMethod paymentMethod);
}
