package cn.pxl.entity.contextaware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ShutdownHookBean implements ApplicationContextAware {
    //在主应用程序关闭前调用destroy方法
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if(applicationContext instanceof GenericApplicationContext){
            ((GenericApplicationContext) applicationContext).registerShutdownHook();
        }
    }
}
