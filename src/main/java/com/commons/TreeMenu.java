package com.commons;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TreeMenu {
    private Integer menuId;
    private Integer parentId;
    private Boolean spread;
    private String title;
    private Boolean last;
    private String checkArr = "0";

    private List<TreeMenu> children = new ArrayList<>();
}
