package cn.pxl.entity.impl;

import cn.pxl.entity.intf.MessageProvider;
import cn.pxl.entity.intf.MessageRender;
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
