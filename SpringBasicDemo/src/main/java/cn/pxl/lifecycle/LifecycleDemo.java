package cn.pxl.lifecycle;

import cn.pxl.config.InitMethodConfig;
import cn.pxl.entity.lifecycle.allInit.InitOrder;
import cn.pxl.entity.lifecycle.initialbean.Singer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class LifecycleDemo {
    public static void main(String[] args) {
        //懒加载，在启动容器bean加载完毕后，容器启动成功， 第一次使用bean时，调用 init 方法，如果 init 方法调用失败，那么会抛出异常。
//        doInitMethod("spring/xml-bean-initmethodlazy-config.xml");
        //即时加载，会在启动容器bean加载完毕后调用 init 方法，如果 init 方法调用失败，那么容器启动失败。
//        doInitMethod("spring/xml-bean-initmethodhungry-config.xml");
        //这种方式不是懒加载。
//        doInitializingBean();
//        doPostConstruct();
//        doInitMethodConfig();

        doAllInit();
    }

    public static void doInitMethod(String configPath){
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext(configPath);
        cn.pxl.entity.lifecycle.initmethod.Singer singer = applicationContext.getBean("singerOne", cn.pxl.entity.lifecycle.initmethod.Singer.class);
        System.out.println(singer);
        cn.pxl.entity.lifecycle.initmethod.Singer singerTwo = applicationContext.getBean("singerTwo", cn.pxl.entity.lifecycle.initmethod.Singer.class);
        System.out.println(singerTwo);
        //没有初始化age，调用init方法会报错。
//        Singer singerThree = applicationContext.getBean("singerThree", Singer.class);
//        System.out.println(singerThree);
    }

    public static void doInitMethodConfig(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(InitMethodConfig.class);
        Singer singer = applicationContext.getBean("singerOne", Singer.class);
        System.out.println(singer);
    }

    public static void doInitializingBean(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("cn.pxl.demo.lifecycle.initialbean");
        applicationContext.refresh();
        Singer singer = applicationContext.getBean("singer", Singer.class);
        System.out.println(singer);
    }

    public static void doPostConstruct(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("cn.pxl.demo.lifecycle.postconstruct");
        applicationContext.refresh();
        Singer singer = applicationContext.getBean("singer", Singer.class);
        System.out.println(singer);
    }

    //@PostConstruct
    //InitializingBean - afterPropertiesSet
    //init method
    public static void doAllInit(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(InitMethodConfig.class);
        InitOrder order = applicationContext.getBean("initOrder", InitOrder.class);
        System.out.println(order);
    }

}
