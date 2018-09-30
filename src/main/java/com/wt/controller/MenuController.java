package com.wt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/9/27.
 */
@Controller
@RequestMapping(value = "menu")
public class MenuController {

    @RequestMapping(value = "toOrg")
   public String toOrg(){
       return "view/org";
   }

    @RequestMapping(value = "toIndex")
   public String toIndex(){
       return "view/index";
   }
    @RequestMapping(value = "toProduct")
    public String toProduct(){
        return "view/product";
    }
    @RequestMapping(value = "toProject")
    public String toProject(){
        return "view/project";
    }
    @RequestMapping(value = "toTest")
    public String toTest(){
        return "view/test";
    }
    @RequestMapping(value = "toDocument")
    public String toDocument(){
        return "view/document";
    }
    @RequestMapping(value = "toStat")
    public String toStat(){
        return "view/stat";
    }

}
