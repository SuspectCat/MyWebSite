package com.mapper;

import com.pojo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuMapper {
    List<Menu> findMenuList(@Param("menuId") int menuId);
    List<Menu> findMenuByUserId(int userId);
}
