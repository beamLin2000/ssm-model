package com.gxa.service.toll;

import com.gxa.entity.tolls.TollDrugs;

import java.util.List;

public interface TollDrugsService {
    List<TollDrugs> queryByTollId(String tollNumber);
    List<TollDrugs> queryByTollVer(String tollDrugsVer,String tollNumber);
}
