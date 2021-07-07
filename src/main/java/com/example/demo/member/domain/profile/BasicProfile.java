package com.example.demo.member.domain.profile;

public class BasicProfile {

    private String profilePic;
    private  String tmi;

    private final VendorInfo vendorInfo;

    public BasicProfile(String profilePic, String tmi,
        VendorInfo vendorInfo) {
        this.profilePic = profilePic;
        this.tmi = tmi;
        this.vendorInfo = vendorInfo;
    }
}
