package cn.pxl.entity.profiles.kindergarten;

import cn.pxl.entity.profiles.Food;
import cn.pxl.entity.profiles.FoodProviderService;

import java.util.ArrayList;
import java.util.List;


public class FoodProviderServiceImpl implements FoodProviderService {
    @Override
    public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<>();
        lunchSet.add(new Food("Milk"));
        lunchSet.add(new Food("Biscuits"));
        return lunchSet;
    }
}
