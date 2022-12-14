package edu.harvard.mgh.lcs.rally.gitpodspaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        System.out.println("DefaultController.home");
        return new ModelAndView("index");
    }
}
