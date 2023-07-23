package cn.pxl.entity.message.decoupled;

import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import java.util.Optional;

@Configuration
@PropertySource(value = "classpath:message.properties")
public class AppConfigOne {
	Environment env;

	public AppConfigOne(Environment env) {
		this.env = env;
	}

	@Bean
	@Lazy
	public MessageProvider messageProvider() {
		return new ConfigurableMessageProvider(Optional.ofNullable(env.getProperty("message")).orElse("hello pxl"));
	}

	@Bean(name = "messageRenderer")
	@Scope(value="prototype")
	@DependsOn(value="messageProvider")
	public MessageRenderer messageRenderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(messageProvider());
		return renderer;
	}
}
