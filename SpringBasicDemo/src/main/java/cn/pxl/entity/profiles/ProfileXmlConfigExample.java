package cn.pxl.entity.profiles;

import java.util.List;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ProfileXmlConfigExample {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:food/kindergarten-config.xml");
//        ctx.getEnvironment().setActiveProfiles("kindergarten");
        ctx.refresh();
        FoodProviderService foodProviderService = ctx.getBean("foodProviderService", FoodProviderService.class);
        List<Food> lunchSet = foodProviderService.provideLunchSet();
        for (Food food: lunchSet) {
            System.out.println("Food: " + food.getName());
        }
        ctx.close();
    }
}
