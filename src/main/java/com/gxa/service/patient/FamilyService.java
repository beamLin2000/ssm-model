package com.gxa.service.patient;

import com.gxa.entity.patients.FamilyAdd;

public interface FamilyService {
    void add(FamilyAdd familyAdd);
    void tpFamilyUpdate(Integer family_id);
    void familyAddUpdate(FamilyAdd familyAdd);
}
