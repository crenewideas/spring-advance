package cn.pxl.entity.propertyplaceholder;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PlaceHolderDemo {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:property/app-context-xml-property.xml");
        ctx.refresh();
        AppProperty appProperty = ctx.getBean("appProperty", AppProperty.class);
        System.out.println("application.home: " + appProperty.getApplicationHome());
        System.out.println("user.home: " + appProperty.getUserHome());
        ctx.close();
    }
}
