package com.test.demo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController
public class LoginController {

    @PostMapping("/foo")
    @PreAuthorize("hasRole('USER')")
    @ResponseBody
    public String foo()
    {
        return "{some stuff}";
    }

}
