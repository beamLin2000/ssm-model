package com.gxa.service.toll;

import com.gxa.entity.patients.Patients;
import com.gxa.entity.tolls.Toll;

import java.util.Date;
import java.util.List;

public interface TollService {
    List<Toll> queryByTollState(Integer tollState);
    List<Toll> queryByTollName(String tollName);
    void delete(Integer tollId);
    List<Toll> queryByTollNumberName(String tollNumberName,Integer tollState);
    List<Toll> queryByDateTime(Date firstTime, Date lastTime);

}
