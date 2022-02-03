package com.service.impl;

import com.commons.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.MenuMapper;
import com.pojo.Menu;
import com.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    @Transactional(readOnly = true)
    public LayuiDataResult getMenuData(PageLimit pageLimit, int menuId) {
        PageHelper.startPage(pageLimit.getPage(), pageLimit.getLimit());

        List<Menu> menuList = menuMapper.findMenuList(menuId);

        PageInfo<Menu> info = new PageInfo<>(menuList);

        LayuiDataResult result = new LayuiDataResult();

        result.setCode(0);
        result.setMsg("");
        result.setCount((int) info.getTotal());
        result.setData(info.getList());

        return result;
    }

    @Override
    public MenuHome getMenuToUserId(Integer userId) {
        MenuHome home = new MenuHome();
        LogoInfo logoInfo = new LogoInfo();

        logoInfo.setTitle("Video");
        logoInfo.setIcon("/images/logo.png");
        logoInfo.setHref("");

        HomeInfo homeInfo = new HomeInfo();
        homeInfo.setHref("/page/welcome.html");
        homeInfo.setTitle("首页");

        home.setHomeInfo(homeInfo);
        home.setLogoInfo(logoInfo);

        List<Menu> menuList = menuMapper.findMenuByUserId(userId);

        List<Menu> ancestorMenuList = new ArrayList<>();
        List<Menu> parentMenuList = new ArrayList<>();
        List<Menu> chileMenuList = new ArrayList<>();

        for (Menu menu : menuList) {
            if (menu.getIsParent() == 1)
                if (1 == menu.getMenuId())
                    ancestorMenuList.add(menu);
                else
                    parentMenuList.add(menu);
            else
                chileMenuList.add(menu);
        }

        for (Menu parentMenu : parentMenuList) {
            for (Menu childMenu : chileMenuList) {
                if (parentMenu.getMenuId() == childMenu.getParentId())
                    parentMenu.getChild().add(childMenu);
            }
        }

        for (Menu menu : ancestorMenuList) {
            menu.setChild(parentMenuList);
        }

        home.setMenuInfo(ancestorMenuList);

        return home;
    }
}
