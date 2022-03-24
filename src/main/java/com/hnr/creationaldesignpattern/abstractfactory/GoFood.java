/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.creationaldesignpattern.abstractfactory;

/**
 *
 * @author hanifnr
 */
public class GoFood extends AbstractAplikasi{

    @Override
    AyamGeprek getAyamGeprek() {
        return new AyamGeprekGoFood();
    }

    @Override
    Bakso getBakso() {
        return new BaksoGoFood();
    }
    
}
