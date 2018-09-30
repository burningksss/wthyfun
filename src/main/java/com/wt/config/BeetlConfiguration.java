package com.wt.config;

import com.wt.model.User;
import com.wt.shiro.ShiroExt;
import org.beetl.core.Template;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;

import java.util.HashMap;
import java.util.Map;

/**
 *  beetl拓展配置,绑定一些工具类,方便在模板中直接调用
 *  Created by Administrator on 2018/9/19.
 */
public class BeetlConfiguration extends BeetlGroupUtilConfiguration {

    @Override
    public void initOther(){
        User user=new User();
        user.setUid(12);
        //groupTemplate.registerFunctionPackage("shiro2", user);
        Map<String,Object> shared = new HashMap<String,Object>();
        shared.put("pa", "212");
        groupTemplate.setSharedVars(shared);
        System.out.println("11");
        Template t = groupTemplate.getTemplate("/templates/view/index.html");
        String str = t.render();
        System.out.println(str);
    }
}
