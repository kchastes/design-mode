package com.kchaste.design.adapter;

/**
 *
 * Driver's work is aircraft
 *
 * @author KChaste Sun
 */
public class Driver {


    private Aircraft aircraft;

    public Driver(){}

    public Driver(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public void work(){
        aircraft.plane();
    }
}
