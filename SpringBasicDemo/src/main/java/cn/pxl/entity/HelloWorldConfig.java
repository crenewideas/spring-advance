package cn.pxl.entity;

import cn.pxl.entity.impl.HelloWorldMessageProvider;
import cn.pxl.entity.impl.StandardOutMessageRender;
import cn.pxl.entity.intf.MessageProvider;
import cn.pxl.entity.intf.MessageRender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
    @Bean
    public MessageProvider oneProvider(){
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRender oneRender(){
        StandardOutMessageRender standardOutMessageRender = new StandardOutMessageRender();
        standardOutMessageRender.setMessageProvider(oneProvider());
        return standardOutMessageRender;
    }
}
