package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(value = "/add")
    public ModelAndView add(@RequestParam("number1") int i, @RequestParam("number2") int j){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("result.jsp");
        mv.addObject("res", i+j);
        return mv;
    }
}
