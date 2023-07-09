package cn.pxl.lifecycle;

import cn.pxl.demo.lifecycle.Singer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class LifecycleDemo {
    public static void main(String[] args) {
        //懒加载，在启动容器bean加载完毕后，容器启动成功， 第一次使用bean时，调用 init 方法，如果 init 方法调用失败，那么会抛出异常。
        doInitMethod("spring/xml-bean-initmethodlazy-config.xml");
        //即时加载，会在启动容器bean加载完毕后调用 init 方法，如果 init 方法调用失败，那么容器启动失败。
        doInitMethod("spring/xml-bean-initmethodhungry-config.xml");
    }

    public static void doInitMethod(String configPath){
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext(configPath);
        Singer singer = applicationContext.getBean("singerOne", Singer.class);
        System.out.println(singer);

        Singer singerTwo = applicationContext.getBean("singerTwo", Singer.class);
        System.out.println(singerTwo);
        //没有初始化age，调用init方法会报错。
//        Singer singerThree = applicationContext.getBean("singerThree", Singer.class);
//        System.out.println(singerThree);
    }

    public static void doInitializingBean(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("cn.pxl.demo.lifecycle");
        applicationContext.refresh();
        Singer singer = applicationContext.getBean("singer", Singer.class);
        System.out.println(singer);
    }
}
