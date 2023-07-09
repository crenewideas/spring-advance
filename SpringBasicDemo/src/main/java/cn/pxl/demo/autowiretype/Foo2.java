package cn.pxl.demo.autowiretype;

import org.springframework.stereotype.Component;

@Component("foo2")
public class Foo2 implements Foo{
    public Foo2() {
        System.out.println("Foo1 no arg constructor called");
    }
}
