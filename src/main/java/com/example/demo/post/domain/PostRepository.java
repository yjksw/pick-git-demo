package com.example.demo.post.domain;

import com.example.demo.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
