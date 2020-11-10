package com.siwuya.petsys.service.impl;

import com.siwuya.petsys.dao.INavDao;
import com.siwuya.petsys.entry.NavInfoEntry;
import com.siwuya.petsys.service.INavBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shi_dd
 * @date 2020/11/10 16:39
 */
@Service
public class NavBizImpl implements INavBiz {
    @Autowired
    private INavDao navDao;
    @Override
    public List<NavInfoEntry> getNavList() {
        return navDao.getNavList();
    }
}
