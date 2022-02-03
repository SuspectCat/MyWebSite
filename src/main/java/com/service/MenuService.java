package com.service;

import com.commons.LayuiDataResult;
import com.commons.MenuHome;
import com.commons.PageLimit;

public interface MenuService {
    LayuiDataResult getMenuData(PageLimit pageLimit, int menuId);

    MenuHome getMenuToUserId(Integer userId);
}
