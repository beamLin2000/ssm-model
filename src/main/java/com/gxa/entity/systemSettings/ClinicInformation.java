package com.gxa.entity.systemSettings;

//诊所信息
public class ClinicInformation {
    private Integer clinicNo;
    private String clinicName;
    private String logo;
    private String clinicOwner;
    private Integer ownerPhone;
    private String ownerEmail;
    private String address;
    private String detailedAddress;
    private String clinicIntroduce;
    private Integer clinicState;

    public Integer getClinicNo() {
        return clinicNo;
    }

    public ClinicInformation(Integer clinicNo, String clinicName, String logo, String clinicOwner, Integer ownerPhone, String ownerEmail, String address, String detailedAddress, String clinicIntroduce, Integer clinicState) {
        this.clinicNo = clinicNo;
        this.clinicName = clinicName;
        this.logo = logo;
        this.clinicOwner = clinicOwner;
        this.ownerPhone = ownerPhone;
        this.ownerEmail = ownerEmail;
        this.address = address;
        this.detailedAddress = detailedAddress;
        this.clinicIntroduce = clinicIntroduce;
        this.clinicState = clinicState;
    }

    public void setClinicNo(Integer clinicNo) {
        this.clinicNo = clinicNo;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getClinicOwner() {
        return clinicOwner;
    }

    public void setClinicOwner(String clinicOwner) {
        this.clinicOwner = clinicOwner;
    }

    public Integer getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(Integer ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getClinicIntroduce() {
        return clinicIntroduce;
    }

    public void setClinicIntroduce(String clinicIntroduce) {
        this.clinicIntroduce = clinicIntroduce;
    }

    public Integer getClinicState() {
        return clinicState;
    }

    public void setClinicState(Integer clinicState) {
        this.clinicState = clinicState;
    }

    @Override
    public String toString() {
        return "ClinicInformation{" +
                "clinicNo=" + clinicNo +
                ", clinicName='" + clinicName + '\'' +
                ", logo='" + logo + '\'' +
                ", clinicOwner='" + clinicOwner + '\'' +
                ", ownerPhone=" + ownerPhone +
                ", ownerEmail='" + ownerEmail + '\'' +
                ", address='" + address + '\'' +
                ", detailedAddress='" + detailedAddress + '\'' +
                ", clinicIntroduce='" + clinicIntroduce + '\'' +
                ", clinicState=" + clinicState +
                '}';
    }
}
