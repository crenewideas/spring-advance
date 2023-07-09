package cn.pxl.fatorybean;

import cn.pxl.config.MessageDigestConfig;
import cn.pxl.entity.fatorybean.MessageDigester;
import cn.pxl.entity.fatorybean.MessageDigesterConf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageDigestFactoryBeanDemo {
    public static void main(String[] args) {
//        config();
        scan();
    }


    public static void config(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MessageDigestConfig.class);
//        MessageDigest digestFactoryBean = applicationContext.getBean("messageDigestFactoryBean", MessageDigest.class);
        MessageDigesterConf messageDigester = applicationContext.getBean("messageDigesterConf", MessageDigesterConf.class);
        messageDigester.digest("pxlngu");
    }

    public static void scan(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("cn.pxl.entity.fatorybean");
        applicationContext.refresh();
        MessageDigester messageDigester = applicationContext.getBean("messageDigester", MessageDigester.class);
        messageDigester.digest("pxlngu");
    }
}
