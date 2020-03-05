package com.hcx.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    public void contextLoads() {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("985701799@qq.com");
        mailMessage.setTo("2987877586@qq.com");

        mailMessage.setSubject("测试");
        mailMessage.setText("spring-邮件测试");
        mailSender.send(mailMessage);
    }
    @Test
    public void test() throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
        helper.setFrom("985701799@qq.com");
        helper.setTo("2987877586@qq.com");

        helper.setSubject("测试");
        helper.setText("<b style='color:red'>spring-邮件测试</b>",true);
        helper.addAttachment("1.jpg",new File("D:\\鬼刀18\\鬼刀18\\7.jpg"));
        helper.addAttachment("2.jpg",new File("D:\\鬼刀18\\鬼刀18\\13.jpg"));

        mailSender.send(mimeMessage);
    }

}
