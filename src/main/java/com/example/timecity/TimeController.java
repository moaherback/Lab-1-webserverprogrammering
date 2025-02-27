package com.example.timecity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TimeController {

    @Autowired
    TimeService timeService;

    @GetMapping("/time")
    String time(@RequestParam("city") String city, Model model) {
        model.addAttribute("thetime", timeService.getTimeByCity(city));
        return "timepage";
    }
}
