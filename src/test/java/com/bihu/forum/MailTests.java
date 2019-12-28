package com.bihu.forum;


import com.bihu.forum.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = ForumApplication.class)
public class MailTests {

    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testTextMail(){
        mailClient.sendMail("kwin361@foxmail.com","激活B户账号","点击激活B乎账号");
    }

    @Test
    public void testHtmlMail(){
        Context context = new Context();
        context.setVariable("username","小伙子");

        String content = templateEngine.process("/mail/demo",context);
        System.out.println(content);

        mailClient.sendMail("kwin361@foxmail.com","一个网页",content);
    }
}
