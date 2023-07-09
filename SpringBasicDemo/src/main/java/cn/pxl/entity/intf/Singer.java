package cn.pxl.entity.intf;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Singer {
    public void sing(){
        System.out.println("lyric");
    }
}
