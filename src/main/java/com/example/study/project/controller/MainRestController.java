package com.example.study.project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
    @RequestMapping(value={"/",""})
    public ResponseEntity<String> main(){

        return ResponseEntity.ok("Hello World");
    }
}
