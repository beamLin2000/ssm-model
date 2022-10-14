package com.gxa.service.patient;

import com.gxa.entity.patients.Family;
import com.gxa.entity.patients.FamilyAdd;

import java.util.List;

public interface FamilyService {
    List<Family> queryByFamilyId(Integer patientId);
    Family queryById(Integer familyId);
    void add(Family family);
    void update(Family family);
    void delete(Integer familyId);

}
