package com.mac.sk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@Slf4j
public class FunctionAPIController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from Function API";
    }

    @GetMapping("/calc/{i1}/{i2}")
    public ResponseEntity<Integer> calculate(@PathVariable Integer i1, @PathVariable Integer i2) {
        log.info(" i1 = {}", i1);
        log.info(" i2 = {}", i2);
        return ResponseEntity.ok(i1 + i2);
    }
}
