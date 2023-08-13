package com.illuminateskills.spring5okesapp.controllers;

import com.illuminateskills.spring5okesapp.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class JokeController {

    private final JokesService jokesService;



    public JokeController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public  String showJoke(Model model) {

        model.addAttribute("joke",jokesService.getJoke());
        return  "index";
    }
}
