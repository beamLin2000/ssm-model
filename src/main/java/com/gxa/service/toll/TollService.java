package com.gxa.service.toll;

import com.gxa.entity.tolls.Toll;
import com.gxa.entity.tolls.TollInquire;

import java.util.Date;
import java.util.List;

public interface TollService {
    List<Toll> queryByInquire(Date firstTime, Date lastTime,TollInquire tollInquire);
    List<Toll> queryByInquires(TollInquire tollInquire);
    void delete(String tollNumber);
    void updateRefunds(String tollNumber);



}
