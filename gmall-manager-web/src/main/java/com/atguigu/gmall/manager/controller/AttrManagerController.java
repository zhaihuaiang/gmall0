package com.atguigu.gmall.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/attr")
@Controller
public class AttrManagerController {
    /**
     * 前往平台属性列表页
     * 所有的去往页面请求，都要加上html后缀
     * @return
     */
    @RequestMapping("listPage.html")
    public String toAttrListPage(){
        return "/attr/attrListPage";
    }

}
