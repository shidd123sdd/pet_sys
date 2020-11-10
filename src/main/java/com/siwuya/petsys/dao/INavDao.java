package com.siwuya.petsys.dao;

import com.siwuya.petsys.entry.NavInfoEntry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author shi_dd
 * @date 2020/11/10 16:41
 */
@Mapper
public interface INavDao {
    @Select("select * from nav_menu_info")
    List<NavInfoEntry> getNavList();
}
