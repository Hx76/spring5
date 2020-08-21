package com.hx76.pojo;

public class Address {
    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    private String addresss;

    @Override
    public String toString() {
        return "Address{" +
                "addresss='" + addresss + '\'' +
                '}';
    }
}
