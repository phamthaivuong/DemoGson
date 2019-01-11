package com.example.phamthaivuong.demogson;

import com.google.gson.annotations.SerializedName;

public class Employee {
    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("age")
    private int mAge;
    @SerializedName("email")
    private String mEmail;
    @SerializedName("address")
    private Address mAddress;


    public Employee(String mFirstName, int mAge, String mEmail, Address mAddress) {
        this.mFirstName = mFirstName;
        this.mAge = mAge;
        this.mEmail = mEmail;
        this.mAddress = mAddress;
    }
}
