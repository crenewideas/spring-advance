package cn.pxl;

import cn.pxl.demo.HelloWorldConfig;
import cn.pxl.demo.intf.MessageRender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
//        annotationConfigApplicationContext.scan("cn.pxl.demo.impl");
//        annotationConfigApplicationContext.refresh();
//        MessageRender renderer = annotationConfigApplicationContext.getBean("renderer", MessageRender.class);
//        renderer.render();
        MessageRender oneRender = annotationConfigApplicationContext.getBean("oneRender", MessageRender.class);

        oneRender.render();
    }
}
