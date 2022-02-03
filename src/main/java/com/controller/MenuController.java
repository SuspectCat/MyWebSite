package com.controller;

import com.commons.LayuiDataResult;
import com.commons.MenuHome;
import com.commons.PageLimit;
import com.pojo.User;
import com.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("list")
    public LayuiDataResult loadMenuList(PageLimit pageLimit, @RequestParam(defaultValue = "0") int menuId) {
        return menuService.getMenuData(pageLimit, menuId);
    }

    @RequestMapping("menuinfo")
    public MenuHome getMenuHome(HttpSession session) {
        User user = (User) session.getAttribute("user");

        return menuService.getMenuToUserId(user.getId());
    }
}
