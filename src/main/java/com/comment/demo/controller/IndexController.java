package com.comment.demo.controller;


import com.comment.demo.models.ActaEntrega;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class IndexController {



    @RequestMapping(value = {"index", "" , "/" }, method = RequestMethod.GET)
    public String index() {

        return "layout/index";

    }
}
