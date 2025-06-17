package com.practice.aoplog.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public String getMessage() {
        return "작업 성공!";
    }
}
