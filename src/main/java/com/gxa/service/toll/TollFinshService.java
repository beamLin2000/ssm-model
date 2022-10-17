package com.gxa.service.toll;

import com.gxa.entity.tolls.TollFinish;

public interface TollFinshService {
    void addFinish(TollFinish tollFinish);
    TollFinish queryByTollId(String tollNumber);
}
