package com.practice.aoplog.controller;

import com.practice.aoplog.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    private final SampleService sampleService;

    @Autowired
    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/test")
    public Result test() {
        String message = sampleService.getMessage(); // ✅ 서비스 호출
        return new Result(message);
    }

    // DTO 클래스 (내부에 같이 있어도 됨)
    static class Result {
        private final String message;

        public Result(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
