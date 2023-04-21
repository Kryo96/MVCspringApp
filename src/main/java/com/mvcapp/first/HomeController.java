package com.mvcapp.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SuppressWarnings("ALL")
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }
}
