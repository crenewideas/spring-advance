package cn.pxl.demo.impl;

import cn.pxl.demo.intf.MessageProvider;
import cn.pxl.demo.intf.MessageRender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service("renderer")
public class StandardOutMessageRender implements MessageRender {

    private MessageProvider messageProvider;

    @Override
    public void render() {
        if(Objects.isNull(messageProvider)){
            throw new RuntimeException("messageProvider must not be null");
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    @Autowired
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
