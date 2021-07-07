package com.example.demo.post.domain;

import com.example.demo.post.domain.comment.Comments;
import com.example.demo.post.domain.contents.Pictures;
import com.example.demo.post.domain.likes.Likes;

public class Post {
    private Pictures pictures;
    private PostContents contents;

    private Likes likes;
    private Comments comments;
    private Tags tags;
}

