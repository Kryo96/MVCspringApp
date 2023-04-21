package com.MVCapp.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "../webapp/index.jsp";
    }
}
 // Could not get RequestDispatcher for [../webapp/index.jsp]: Check that the corresponding file exists within your web application archive!