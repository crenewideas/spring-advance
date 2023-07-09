package cn.pxl.entity.fatorybean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.security.MessageDigest;

@Component
public class MessageDigester {
    private MessageDigest messageDigest1;
    private MessageDigest messageDigest2;

    @Autowired
    @Qualifier("messageDigestFactoryBean")
    public void setMessageDigest1(MessageDigest messageDigest1) {
        this.messageDigest1 = messageDigest1;
    }
    @Autowired
    @Qualifier("sha1MessageDigestFactoryBean")
    public void setMessageDigest2(MessageDigest messageDigest2) {
        this.messageDigest2 = messageDigest2;
    }

    public void digest(String message) {
        System.out.println("Digest1");
        digest(message, messageDigest1);
        System.out.println("Digest2");
        digest(message, messageDigest2);
    }

    public void digest(String message, MessageDigest messageDigest) {
        System.out.println("use alogrithm : " + messageDigest.getAlgorithm());
        messageDigest.reset();
        byte[] bytes = message.getBytes();
        byte[] out = messageDigest.digest(bytes);
        System.out.println(out);
    }

}
