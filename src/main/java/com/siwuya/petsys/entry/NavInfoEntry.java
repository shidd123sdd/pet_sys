package com.siwuya.petsys.entry;

import lombok.Data;

import java.sql.Date;

/**
 * @author shi_dd
 * @date 2020/11/10 16:42
 */
@Data
public class NavInfoEntry {
    private Long id;
    private String navName;
    private int navLevel;
    private int parentNav;
    private Date createTime;
    private String navPath;
    private String navIcon;
}
