package com.example.demo.member.domain.analysis;

import com.example.demo.member.domain.Vendor;

public class MemberStatistics {

    private int commit;
    private Vendor vendor;

    private MemberStatistics(Vendor vendor) {
        this.vendor = vendor;
    }

    public int getCommit(){
        return vendor.getCommit();
    }
}
