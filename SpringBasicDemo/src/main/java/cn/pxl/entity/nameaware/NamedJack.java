package cn.pxl.entity.nameaware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class NamedJack implements BeanNameAware {

    private String name;

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }

    public void getName(){
        System.out.println("name = " + name);
    }
}
