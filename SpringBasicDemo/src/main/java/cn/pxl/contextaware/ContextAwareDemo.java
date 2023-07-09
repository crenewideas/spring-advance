package cn.pxl.contextaware;

import cn.pxl.entity.nameaware.NamedJack;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextAwareDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("cn.pxl.entity.contextaware");
        applicationContext.refresh();
    }
}
