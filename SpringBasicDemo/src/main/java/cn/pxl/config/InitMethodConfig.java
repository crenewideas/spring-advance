package cn.pxl.config;

import cn.pxl.entity.lifecycle.allInit.InitOrder;
import cn.pxl.entity.lifecycle.initmethod.Singer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class InitMethodConfig {

    //声明 init 方法
    @Bean(initMethod = "init")
    @Lazy
    public InitOrder initOrder(){
        return new InitOrder();
    }

}
