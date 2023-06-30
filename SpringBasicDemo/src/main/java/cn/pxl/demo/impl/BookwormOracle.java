package cn.pxl.demo.impl;

import cn.pxl.demo.intf.Oracle;

public class BookwormOracle implements Oracle {
    @Override
    public String defineMeaningOfLife() {
        return "hello mean of life";
    }
}
