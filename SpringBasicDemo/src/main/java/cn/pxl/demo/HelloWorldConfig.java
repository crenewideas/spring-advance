package cn.pxl.demo;

import cn.pxl.demo.impl.HelloWorldMessageProvider;
import cn.pxl.demo.impl.StandardOutMessageRender;
import cn.pxl.demo.intf.MessageProvider;
import cn.pxl.demo.intf.MessageRender;
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
