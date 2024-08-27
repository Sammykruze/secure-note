package com.kunleCode.secureNote;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/show")
    public String show(){
        return "Hello my controller";
    }
}
