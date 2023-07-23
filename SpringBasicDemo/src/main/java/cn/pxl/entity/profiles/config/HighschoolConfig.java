package cn.pxl.entity.profiles.config;

import cn.pxl.entity.profiles.FoodProviderService;
import cn.pxl.entity.profiles.highschool.FoodProviderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by iuliana.cosmina on 3/18/17.
 */
@Configuration
@Profile("highschool")
public class HighschoolConfig {
	@Bean
	public FoodProviderService foodProviderService(){
		return new FoodProviderServiceImpl();
	}
}
