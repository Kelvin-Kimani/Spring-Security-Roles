package com.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

    @GetMapping
    public String getIndex(){
        return "index";
    }

    @GetMapping("/admin")
    public String getAdminPage(){
        return "admin";
    }

    @GetMapping("/oo")
    public String getOrgOfficerPage(){
        return "oo";
    }

    @GetMapping("/user")
    public String getUserPage(){
        return "user";
    }
}
