package com.example.recyclerviewpractice;

public class Contact {
    private int sno;
    private String phoneNumber;
    private String name;

    public Contact(int sno, String phoneNumber, String name){
        this.sno = sno;
        this. phoneNumber = phoneNumber;
        this. name = name;
    }

    public int getSno() {
        return sno;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

}
