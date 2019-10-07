package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/employeeform")
    public String loadFormPage(Model m){
        m.addAttribute("employee", new Employee());
        return "employeeform";
    }
    @PostMapping("/employeeform")
    public String loadFormPage(@ModelAttribute Employee employee, Model m){
        m.addAttribute("employee", employee);
        return "confirmemployee";
    }
}
