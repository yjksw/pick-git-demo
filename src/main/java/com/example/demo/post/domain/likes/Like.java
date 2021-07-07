package com.example.demo.post.domain.likes;

import com.example.demo.member.domain.Member;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

@Embeddable
public class Like {
    private Member member;
}
