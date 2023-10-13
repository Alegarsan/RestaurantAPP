package org.ulpgc.is1.model;

public class Address {

    private String street, city;
    private int number, postalcode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(int postalcode) {
        this.postalcode = postalcode;
    }

    public Address(String street, String city, int number, int postalcode) {
        this.street = street;
        this.city = city;
        this.number = number;
        this.postalcode = postalcode;
    }
}
