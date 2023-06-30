package cn.pxl;

import cn.pxl.demo.intf.MessageRender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.scan("cn.pxl.demo.impl");
        annotationConfigApplicationContext.refresh();
        MessageRender renderer = annotationConfigApplicationContext.getBean("renderer", MessageRender.class);
        renderer.render();
    }
}
