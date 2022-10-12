package com.gxa.entity.patients;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FamilyAdd {
    private String family_relationship;
    private String family_name;
    private Date family_birthday;
    private String family_gender;
    private Integer family_phone;
}
