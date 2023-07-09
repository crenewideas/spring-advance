package cn.pxl.autowiretype;

import cn.pxl.entity.autowiretype.TargetOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowireTypeDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("cn.pxl.demo.autowiretype");
        applicationContext.refresh();
        TargetOne targetOne = applicationContext.getBean("targetOne", TargetOne.class);
        System.out.println(targetOne.getBar());
    }
}
