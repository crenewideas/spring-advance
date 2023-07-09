package cn.pxl.entity;

import cn.pxl.entity.intf.AbstractLookup;
import cn.pxl.entity.intf.Singer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.pxl.entity.intf")
public class LookupConfig {
    @Bean
    public AbstractLookup lookupSingleBean(){
        return new AbstractLookup(){
            @Override
            public Singer getSinger() {
                return singleSinger();
            }
        };
    }

    @Bean
    public Singer singleSinger(){
        return new Singer();
    }
}
