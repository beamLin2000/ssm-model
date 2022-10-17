package com.gxa.service.patient;

import com.gxa.entity.patients.Family;
import com.gxa.entity.patients.FamilyAdd;

import java.util.List;

public interface FamilyService {
    List<Family> queryByFamilyId(String patientCard);
    Family queryById(String familyName);
    void add(Family family);
    void update(Family family);
    void delete(String familyName);

}
