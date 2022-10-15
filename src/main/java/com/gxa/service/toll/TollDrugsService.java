package com.gxa.service.toll;

import com.gxa.entity.tolls.TollDrugs;

public interface TollDrugsService {
    TollDrugs queryByTollId(Integer tollId);
}
