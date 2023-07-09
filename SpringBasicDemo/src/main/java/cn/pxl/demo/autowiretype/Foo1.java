package cn.pxl.demo.autowiretype;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
@Primary
public class Foo1 implements Foo{

    public Foo1() {
        System.out.println("Foo1 no arg constructor called");
    }
}
