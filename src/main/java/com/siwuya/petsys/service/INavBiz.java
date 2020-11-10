package com.siwuya.petsys.service;

import com.siwuya.petsys.entry.NavInfoEntry;

import java.util.List;

/**
 * @author shi_dd
 * @date 2020/11/10 16:37
 */
public interface INavBiz {
    List<NavInfoEntry> getNavList();
}
