package com.ztx.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author rope
 * @Date 2020/10/19 11:02
 * @Version 1.0
 */
@RestController
@Slf4j
public class helloController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        log.info("done");
        return new ResponseEntity<>("Hello,ResposeEntity", HttpStatus.OK);
    }
}
