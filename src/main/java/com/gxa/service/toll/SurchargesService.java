package com.gxa.service.toll;

import com.gxa.entity.tolls.Surcharges;


import java.util.List;

public interface SurchargesService {
    List<Surcharges> queryByTollId(String tollNumber);
}
