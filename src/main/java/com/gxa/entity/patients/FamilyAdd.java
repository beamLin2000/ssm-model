package com.gxa.entity.patients;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FamilyAdd {
    private String familyRelationship;
    private String familyName;
    private Date familyBirthday;
    private String familyGender;
    private Integer familyPhone;
}
