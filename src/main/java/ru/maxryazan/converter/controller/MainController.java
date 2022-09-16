package ru.maxryazan.converter.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.maxryazan.converter.service.ServiceClass;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final ServiceClass service;

    @GetMapping("/")
    public String getShow(){
        return "converter";
    }

    @PostMapping("/")
    public String postShow(@RequestParam double count, @RequestParam String base,
                           @RequestParam String into, Model model){
        model.addAttribute("result", service.execute(count, base, into));
        return "converter";
    }
}
