package cn.pxl.entity.lifecycle.initialbean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class Singer implements InitializingBean {
    private String name;

    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("start init method call");
        if(name == null){
            System.out.println("using default name");
            this.name = "defaultName";
        }
        if(age == null){
            System.out.println("you must set age of your bean");
            age = 20;
//            throw new IllegalAccessException("you must set age of your bean");
        }
    }


    @PostConstruct
    public void init() throws IllegalAccessException {
        System.out.println("start init method call");
        if(name == null){
            System.out.println("using default name");
            this.name = "defaultName";
        }
        if(age == null){
            throw new IllegalAccessException("you must set age of your bean");
        }
    }

}
