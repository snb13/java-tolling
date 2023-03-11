package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuessingController {
    @RequestMapping("/guess")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="Noname") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("num", Math.random());
        return "guessing";
    }
}
