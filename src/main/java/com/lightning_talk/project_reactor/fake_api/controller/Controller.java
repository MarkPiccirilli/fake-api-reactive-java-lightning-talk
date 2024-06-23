package com.lightning_talk.project_reactor.fake_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fake-api")
public class Controller {

    @GetMapping("get-response")
    public ResponseEntity<String> getResponse() {
        try {
            Thread.sleep(1000);
            return ResponseEntity.ok("Leo is my favorite cat!");
        } catch (Exception e) {
            System.out.println("Error");
            throw new RuntimeException("There was an Error");
        }
    }
}
