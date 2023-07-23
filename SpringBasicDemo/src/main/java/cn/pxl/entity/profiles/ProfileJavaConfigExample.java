package cn.pxl.entity.profiles;

import cn.pxl.entity.profiles.Food;
import cn.pxl.entity.profiles.FoodProviderService;
import cn.pxl.entity.profiles.config.HighschoolConfig;
import cn.pxl.entity.profiles.config.KindergartenConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import java.util.List;

/**
 * Created by iuliana.cosmina on 3/18/17.
 */
public class ProfileJavaConfigExample {
	public static void main(String... args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(
				KindergartenConfig.class,
				HighschoolConfig.class);
		ctx.getEnvironment().setActiveProfiles("kindergarten");
		FoodProviderService foodProviderService =
				ctx.getBean("foodProviderService", FoodProviderService.class);
		List<Food> lunchSet = foodProviderService.provideLunchSet();
		for (Food food : lunchSet) {
			System.out.println("Food: " + food.getName());
		}
		ctx.close();
	}
}
