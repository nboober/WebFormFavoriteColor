package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @GetMapping("/survey")
    public String loadQuestionaire(Model model){
        model.addAttribute("data", new Data());
        return "questionform";
    }

    @RequestMapping("/survey")
    public String addingQuestion(Model model){
        int rand = (int)(Math.ceil(Math.random()*2));

        if(rand == 1){
            model.addAttribute("myquestion", "What is your favorite color?");
            return "questionform";
        }else{
            model.addAttribute("myquestion", "What is the airspeed velocity of an unladen swallow?");
            return "questionform";
        }

    }

    @PostMapping("/survey")
    public String processQuestionaire(@Valid Data data, BindingResult result){
        if(result.hasErrors()){
            return "questionform";
        }
        return "answerform";

    }

}
