package com.example.vinay.week1Introduction.introductionToSpringBoot.week1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Flavour", havingValue = "chocolate")
public class Chocolate implements Frosting, Syrup{

    @Override
    public void getFrostingType() {
        System.out.println("Chocolate Frosting");
    }

    @Override
    public void getSyrupType() {
        System.out.println("Chocolate Syrup");
    }
}
