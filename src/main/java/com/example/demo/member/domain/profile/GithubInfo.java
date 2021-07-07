package com.example.demo.member.domain.profile;

import com.example.demo.member.domain.Vendor;

public class GithubInfo extends VendorInfo {

    private String name;
    private String company;
    private String location;
    private String webSite;
    private String twitter;

    public GithubInfo(Vendor vendor) {
        super(vendor);

    }

    public GithubInfo(String company, String location, String webSite, String twitter, Vendor vendor) {
        super(vendor);
        this.company = company;
        this.location = location;
        this.webSite = webSite;
        this.twitter = twitter;
    }

}
