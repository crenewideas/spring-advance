package cn.pxl.demo;

import cn.pxl.demo.intf.AbstractLookup;
import cn.pxl.demo.intf.PrototypeLookup;
import cn.pxl.demo.intf.Singer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("cn.pxl.demo.intf")
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
