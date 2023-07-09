package cn.pxl.entity.lifecycle.allInit;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class InitOrder implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean - afterPropertiesSet");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("@PostConstruct");
    }

    public void init() {
        System.out.println("init method");
    }
}
