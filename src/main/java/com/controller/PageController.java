package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("/{p}.html")
    public String page(@PathVariable String p, @RequestParam(defaultValue = "-1") int userId,
                       @RequestParam(defaultValue = "-1") int roleId, Model model) {
        if (p.equals("user_role")) {
            model.addAttribute("userId", userId);
        }

        if (p.equals("role_menu")) {
            model.addAttribute("roleId", roleId);
        }

        return p;
    }
}
