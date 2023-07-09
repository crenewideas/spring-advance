package cn.pxl;

import cn.pxl.demo.impl.replace.ReplacementTarget;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ReplaceConfig {
    public static void main(String[] args) {
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext("spring/xml-bean-replace-config.xml");
        ReplacementTarget afterReplace = applicationContext.getBean("afterReplace", ReplacementTarget.class);
//        System.out.println(afterReplace.formatMessage("hello"));
        System.out.println(afterReplace.formatMessage(new Object()));
    }
}
