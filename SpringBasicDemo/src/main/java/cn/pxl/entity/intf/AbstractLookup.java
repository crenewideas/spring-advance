package cn.pxl.entity.intf;

public abstract class AbstractLookup {
    public abstract Singer getSinger();
    public void lookupSing(){
        getSinger().sing();
    }
}
