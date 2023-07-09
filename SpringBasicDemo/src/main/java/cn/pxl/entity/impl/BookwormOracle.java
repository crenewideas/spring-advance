package cn.pxl.entity.impl;

import cn.pxl.entity.intf.Oracle;

public class BookwormOracle implements Oracle {
    @Override
    public String defineMeaningOfLife() {
        return "hello mean of life";
    }
}
