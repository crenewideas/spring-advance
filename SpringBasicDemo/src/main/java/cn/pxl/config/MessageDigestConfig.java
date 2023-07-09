package cn.pxl.config;

import cn.pxl.entity.fatorybean.MessageDigestFactoryBean;
import cn.pxl.entity.fatorybean.MessageDigesterConf;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageDigestConfig {
    @Bean
    public MessageDigestFactoryBean md5MessageDigest() throws Exception {
        return new MessageDigestFactoryBean();
//        Md5MessageDigestFactoryBean md5MessageDigestFactoryBean = new Md5MessageDigestFactoryBean();
//         md5MessageDigestFactoryBean.getObject();
    }

    @Bean
    public MessageDigestFactoryBean sha1MessageDigest() throws Exception {
        MessageDigestFactoryBean messageDigestFactoryBean = new MessageDigestFactoryBean();
        messageDigestFactoryBean.setAlgorithmName("SHA1");
        return messageDigestFactoryBean;

//        return md5MessageDigestFactoryBean.getObject();
    }

    @Bean
    public MessageDigesterConf messageDigesterConf() throws Exception {
        MessageDigesterConf messageDigester = new MessageDigesterConf();
        messageDigester.setMessageDigest1(md5MessageDigest().getObject());
        messageDigester.setMessageDigest2(sha1MessageDigest().getObject());
        return messageDigester;
    }
}
