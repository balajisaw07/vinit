package org.java;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class service {

    @GetMapping("/")
    public String home() {
        return "hello world";
    }

}
