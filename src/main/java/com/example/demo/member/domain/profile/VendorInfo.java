package com.example.demo.member.domain.profile;

import com.example.demo.member.domain.Vendor;

public abstract class VendorInfo {

    private Vendor vendor;

    public VendorInfo(Vendor vendor) {
        this.vendor = vendor;
    }
}
