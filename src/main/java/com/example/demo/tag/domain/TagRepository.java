package com.example.demo.tag.domain;

import com.example.demo.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {

}
