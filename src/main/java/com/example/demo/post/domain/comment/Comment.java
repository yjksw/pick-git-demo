package com.example.demo.post.domain.comment;

import com.example.demo.member.domain.Member;
import java.time.LocalDateTime;

public class Comment {
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Member member;
    private CommentContent content;
}
