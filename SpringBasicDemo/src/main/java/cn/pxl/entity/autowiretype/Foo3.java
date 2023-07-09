package cn.pxl.entity.autowiretype;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("Foo3")
@Lazy
public class Foo3 implements Foo{
    public Foo3() {
        System.out.println("Foo3 no arg constructor called");
    }
}
