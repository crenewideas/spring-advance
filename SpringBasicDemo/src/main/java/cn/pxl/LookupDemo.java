package cn.pxl;

import cn.pxl.entity.LookupConfig;
import cn.pxl.entity.intf.AbstractLookup;
import cn.pxl.entity.intf.DemoBean;
import cn.pxl.entity.intf.Singer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LookupDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LookupConfig.class);
        AbstractLookup lookupBean = applicationContext.getBean("lookupSingleBean", AbstractLookup.class);
        Singer singer = lookupBean.getSinger();
        Singer singer2 = lookupBean.getSinger();
        System.out.println(singer2 == singer);
        //注入 多例bean的方式
        DemoBean lookupPrototypeBean = applicationContext.getBean("prototypeLookup", DemoBean.class);
        Singer singer3 = lookupPrototypeBean.getMySinger();
        Singer singer4 = lookupPrototypeBean.getMySinger();
        System.out.println(singer3 == singer4);

    }
}
