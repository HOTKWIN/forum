package com.bihu.forum.controller;

import com.bihu.forum.util.ForumUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author kwin
 * @create 2020-01-05 23:03
 */
@Controller
@RequestMapping("/alpha")
public class AlphaController {
    //ajax示例
    @RequestMapping(path = "/ajax",method = RequestMethod.POST)
    @ResponseBody
    public String testAjax(String name,int age){
        System.out.println(name);
        System.out.println(age);

        return ForumUtil.getJSONString(0,"操作成功！");
    }
}
