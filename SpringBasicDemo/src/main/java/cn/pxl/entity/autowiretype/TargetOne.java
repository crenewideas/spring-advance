package cn.pxl.entity.autowiretype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TargetOne {

    private Foo foo;
    private Foo foo2;
    private Bar bar;

//    public TargetOne() {
//    }

//    public TargetOne(Foo foo, Bar bar) {
//        this.foo = foo;
//        this.bar = bar;
//        System.out.println("constructor foo & bar set");
//    }
//
//    public TargetOne(Foo foo) {
//        this.foo = foo;
//        System.out.println("constructor foo set");
//    }
//
//    public TargetOne(Bar bar) {
//        this.bar = bar;
//        System.out.println("constructor bar set");
//    }

    @Autowired
    public void setFoo(Foo foo) {
        this.foo = foo;
        System.out.println("set foo by type");
    }
    @Autowired
    @Qualifier("Foo2")
    public void setFoo2(Foo foo2) {
        this.foo2 = foo2;
        System.out.println("set foo2 by name");
    }
    @Autowired
    public void setBar(Bar bar) {
        this.bar = bar;
        System.out.println("set bar");
    }

    public Foo getFoo() {
        return foo;
    }

    public Foo getFoo2() {
        return foo2;
    }

    public Bar getBar() {
        return bar;
    }
}
