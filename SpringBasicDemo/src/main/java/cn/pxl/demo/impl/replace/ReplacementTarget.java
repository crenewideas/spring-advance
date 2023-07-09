package cn.pxl.demo.impl.replace;

public class ReplacementTarget {
    public String formatMessage(String msg){
        return "pxlngu1:" + msg;
    }

    public String formatMessage(Object msg){
        return "pxlngu2:"+ msg;
    }
}
