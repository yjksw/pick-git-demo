package com.example.demo.authenticate.domain;

import org.springframework.beans.factory.annotation.Value;

public class OAuth {

    @Value("pickgit.oauth2.client_id")
    private String clientId;
    @Value("pickgit.oauth2.client_secret")
    private String clientSecret;

    public void doSomething() {
    }

}
