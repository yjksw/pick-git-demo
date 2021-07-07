package com.example.demo.member.domain;

import com.example.demo.member.domain.analysis.MemberStatistics;
import com.example.demo.member.domain.profile.BasicProfile;
import com.example.demo.member.domain.relationship.Followers;
import com.example.demo.member.domain.relationship.Followings;

public class Member {
    private BasicProfile basicProfile;
    private Followers followers;
    private Followings followings;
    private MemberStatistics statistics;

    private Posts posts;
}
