package com.humana.dhp.dhppocs.hhh.company.DataTransferObject;

public class LoanApplication {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    String firstName;
    String lastName;
    int age;
    String address;
    long ssn;

    public void setApplicantNumber(int applicantNumber) {
        this.applicantNumber = applicantNumber;
    }

    int applicantNumber;

    public void address(String s) {
    }
}
