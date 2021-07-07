package com.example.demo.post.domain.contents;

import static java.util.stream.Collectors.toList;

import java.util.List;

public class Pictures {
    List<Picture> pictures;

    public List<String> getUrls() {
        return pictures.stream()
            .map(Picture::getUrl)
            .collect(toList());
    }
}
