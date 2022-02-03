package com.pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Menu {
    private Integer menuId;
    private Integer parentId;
    private String title;
    private String href;
    private String icon;
    private String target;
    private Integer isParent;
    private Integer status;

    private List<Menu> child = new ArrayList<>();
}
