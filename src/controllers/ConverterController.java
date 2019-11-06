package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {

    @GetMapping("")
    public String goToIndex(){
        return "index";
    }
    @PostMapping ("/convert")
    public String Convert(@RequestParam double rate, double usd, Model model){

        double result = rate * usd;
        model.addAttribute("result",result);
        model.addAttribute("rate", rate);
        model.addAttribute("usd",usd);

        return "index";
    }


}
