package com.example.vinay.week1Introduction.introductionToSpringBoot.week1;

import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    final private Frosting frosting;
    final private Syrup syrup;

    CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    void bakeCake() {
        frosting.getFrostingType();
        syrup.getSyrupType();
    }
}
