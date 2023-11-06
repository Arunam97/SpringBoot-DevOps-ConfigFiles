package com.springbootdevopsconfigfiles;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public ResponseEntity<String> defaultEndpoint() {
        return new ResponseEntity<>("API is working! Try going to /hello.", HttpStatus.OK);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> helloEndpoint() {
        return new ResponseEntity<>("Hello, World!", HttpStatus.OK);
    }

    @RequestMapping("/**")
    public ResponseEntity<String> fallbackEndpoint() {
        return new ResponseEntity<>("Please go to / or /hello.", HttpStatus.NOT_FOUND);
    }
}
