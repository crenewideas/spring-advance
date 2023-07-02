package cn.pxl.demo.intf;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class PrototypeLookup implements DemoBean{
    //注入多例 bean 的方式：方法注入。
    @Lookup("singer")
    @Override
    public Singer getMySinger() {
        return null;
    }

    @Override
    public void doSomeThing() {
        getMySinger().sing();
    }
}
