package com.louis.spark;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloBooot {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "sssss";
    }

    @RequestMapping(value = "/first", method = RequestMethod.GET)
    public ModelAndView firstDemo(){
        return new ModelAndView("test");
    }

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public ModelAndView secondDemo(){
        return new ModelAndView("demo");
    }
}
