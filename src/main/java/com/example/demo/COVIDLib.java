package com.example.demo;

import org.apache.commons.math3.distribution.NormalDistribution;

class COVIDLib {

    double covidChanceEnMoyenne(NormalDistribution n, int m) {
        return n.cumulativeProbability(m);
    }

    double covidChanceDurree(NormalDistribution n, int a, int b) {
        return n.probability(a, b);
    }

}
