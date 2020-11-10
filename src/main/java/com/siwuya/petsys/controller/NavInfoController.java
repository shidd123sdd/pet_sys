package com.siwuya.petsys.controller;

import com.siwuya.petsys.service.INavBiz;
import com.siwuya.petsys.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shi_dd
 * @date 2020/11/10 16:33
 */
@RestController
@RequestMapping("/api/nav")
public class NavInfoController {
    @Autowired
    private INavBiz navBiz;

    @RequestMapping("/getNavList")
    public JsonResult getNavList(){
        return new JsonResult(navBiz.getNavList());
    }
}
