package com.example.pi19_4;

import java.util.Date;

public class Person {
    private Integer id;
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private String postalCode;
    private String birthday;

    public String getStreet() {
        return street;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getId() {
        return id;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
