package cn.pxl.entity.autowiretype;

import org.springframework.stereotype.Component;

@Component("Foo2")
public class Foo2 implements Foo{
    public Foo2() {
        System.out.println("Foo2 no arg constructor called");
    }
}
