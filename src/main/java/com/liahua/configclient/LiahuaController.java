package com.liahua.configclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class LiahuaController {


    private final LiahuaProperties liahuaProperties;

    public LiahuaController(LiahuaProperties liahuaProperties) {
        this.liahuaProperties = liahuaProperties;
    }

    @GetMapping("/test")
    public String getUserName() {
        return liahuaProperties.getUsername();
    }
}
