package cn.pxl.demo.intf;

public abstract class AbstractLookup {
    public abstract Singer getSinger();
    public void lookupSing(){
        getSinger().sing();
    }
}
