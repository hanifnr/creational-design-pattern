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
public class AplikasiFactory {
    
    enum Aplikasi {GOFOOD, SHOPEEFOOD}
    
    static AbstractAplikasi getAplikasi(Aplikasi aplikasi) {
        switch(aplikasi) {
            case GOFOOD -> {
                return new GoFood();
            }
            case SHOPEEFOOD -> {
                return new ShopeeFood();
            }
        }
        return null;
    }
    
}
