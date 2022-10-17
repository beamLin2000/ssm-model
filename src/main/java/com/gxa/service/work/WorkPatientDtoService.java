package com.gxa.service.work;

import com.gxa.dto.work.WorkPatientDto;

public interface WorkPatientDtoService {
    WorkPatientDto queryWorkPatientDtoByPhoneNum(String idCard);
    void updateStatus(String idCard);
}
