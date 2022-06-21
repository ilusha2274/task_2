package com.task2.task2.controllers;

import com.task2.task2.command.IShellManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class homeController {

    @Autowired
    private IShellManager iShellManager;

    @GetMapping("/")
    public String printHome (Model model){
        return "index";
    }

    @PostMapping("/")
    public String printCommand(String textCommand,Model model){
        model.addAttribute("commandInfo",iShellManager.chekCommand(textCommand));
        return "index";
    }

    @PostMapping("/list")
    public String printListCommands(Model model){
        List<String> listCommands = iShellManager.getListCommand();
        model.addAttribute("listCommands", listCommands);
        return "index";
    }
}
