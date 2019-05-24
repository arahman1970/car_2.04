package com.example.demo;
// Controller
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/carform")
    public String loadCarForm(Model model) {
        model.addAttribute("carinfo", new Carinfo());
        return "carform";
    }
    @PostMapping("/carform")
    public String loadFromPage(@ModelAttribute Carinfo carinfo, Model model) {
        model.addAttribute("carinfo", carinfo);
        return "confirmcar";
    }
}
