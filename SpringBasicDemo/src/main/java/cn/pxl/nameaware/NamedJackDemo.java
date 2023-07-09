package cn.pxl.nameaware;

import cn.pxl.entity.nameaware.NamedJack;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class NamedJackDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("cn.pxl.entity.nameaware");
        applicationContext.refresh();
        NamedJack bean = applicationContext.getBean(NamedJack.class);
        //name = namedJack
        bean.getName();
    }
}
