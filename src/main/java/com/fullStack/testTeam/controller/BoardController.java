package com.fullStack.testTeam.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/board/**")
@Slf4j
@Controller
public class BoardController {

    @GetMapping("/list")
    public void list(){}

    @GetMapping("/register")
    public void register(){}

    @GetMapping("/detail")
    public void detail(){}

}
