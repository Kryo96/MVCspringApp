package com.mvcapp.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@SuppressWarnings("ALL")
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }


    /* questo codice è brutto riscriviamolo in modo tale che i parametri val1 e val2 vengano passati direttamente come
    come argomenti della funzione.

    public String add(HttpServletRequest req){


        int val1 = Integer.parseInt(req.getParameter("num1"));
        int val2 = Integer.parseInt(req.getParameter("num2"));

        HttpSession sesso = req.getSession();
        sesso.setAttribute("num3", val1+val2); */

    /* così ci piace ma lo rifacciamo con il model view class
        @RequestMapping("add")
        public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, HttpSession sess){ */
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j){

        ModelAndView mv = new ModelAndView();

        mv.setViewName("result.jsp");
        int num3 = i+j;
        mv.addObject("num3", num3);

        return mv;
    }
}
