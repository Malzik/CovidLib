package com.example.demo;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class COVIDLibTest {
    private NormalDistribution n;
    private COVIDLib covidLib;

    @BeforeEach
    void setUp() {
        n = new NormalDistribution();
        covidLib = new COVIDLib();
    }

    @Test
    void covidChanceEnMoyenne() {
        double response = covidLib.covidChanceEnMoyenne(n, 5);

        assertEquals(0.99, response, 0.1);
    }

    @Test
    void covidChanceDurree() {
        double response = covidLib.covidChanceDurree(n, -6, 29);

        assertEquals(0.99, response, 0.1);
    }
}