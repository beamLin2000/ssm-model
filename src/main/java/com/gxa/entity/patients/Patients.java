package com.gxa.entity.patients;

import lombok.Data;

import java.util.Date;
@Data
public class Patients {
    private Integer patient_id;
    private Integer patient_number;
    private String patient_name;
    private Integer patient_card;
    private Integer patient_age;
    private Date patient_birthday;
    private String patient_gender;
    private String patient_phone;
    private Integer patient_documents;
    private String patient_source;
    private Date patient_expiry;
    private String patient_group;
    private String patient_marriage;
    private String patient_address;
    private String patient_detailed_address;
    private String patient_degree;
    private String patient_occupation;
    private String patient_job;
    private String patient_remark;
    private Date patient_creattime;
    private String operators;

    public Patients(Integer patient_id, Integer patient_number, String patient_name, Integer patient_age, String patient_gender, String patient_phone, Date patient_creattime, String operators) {
        this.patient_id = patient_id;
        this.patient_number = patient_number;
        this.patient_name = patient_name;
        this.patient_age = patient_age;
        this.patient_gender = patient_gender;
        this.patient_phone = patient_phone;
        this.patient_creattime = patient_creattime;
        this.operators = operators;
    }

    public Patients() {
    }
}
