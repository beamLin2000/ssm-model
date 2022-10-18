package com.gxa.entity.work;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PatientAllInfoDto {
    private WorkPatient patient;
    private MedicalRecordPhysical medicalRecordPhysical;
    private List<Charge> charges;
    private List<MedicalCharge> medicalCharges;
    private List<ItemCharge> itemCharge;
    private Prescriptions prescriptions;
}
