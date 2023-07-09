package cn.pxl.entity.impl.replace;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ReplacerForTarget implements MethodReplacer {

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        if(isFormatMessageMethod(method)){
            return "pxlnguReplace:" +  objects[0];
        } else {
            throw new IllegalArgumentException("unable to replace method!");
        }
    }

    private boolean isFormatMessageMethod(Method method){
        if (method.getParameterTypes().length != 1) {
            return false;
        }
        if (!"formatMessage".equals(method.getName())) {
            return false;
        }
        if (!String.class.equals(method.getReturnType())) {
            return false;
        }
        return String.class.equals(method.getParameterTypes()[0]);
    }
}
