package com.atl23.securityapp;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("admin")
public class Controller {

    @GetMapping("/admin")
    public String admins(){
        return "admin";
    }

}
