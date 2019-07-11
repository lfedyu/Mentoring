package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MainController {

    @RequestMapping(value = "/add")
    public ModelAndView add(@RequestParam("n1") int i, @RequestParam("n2") int j, HttpServletRequest request, HttpServletResponse response){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("result.jsp");
        mv.addObject("res", i+j);
        return mv;
    }
}
