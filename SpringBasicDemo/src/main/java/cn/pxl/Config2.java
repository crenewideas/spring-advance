package cn.pxl;

import cn.pxl.demo.intf.MessageRender;
import cn.pxl.demo.intf.Oracle;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class Config2 {
    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("spring/xml-bean-factory-config-2.xml"));
        MessageRender render = (MessageRender)defaultListableBeanFactory.getBean("render");
        render.render();
    }
}