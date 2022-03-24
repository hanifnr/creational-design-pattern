/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.creationaldesignpattern.abstractfactory;

import java.math.BigDecimal;

/**
 *
 * @author hanifnr
 */
public abstract class Makanan {

    protected BigDecimal diskonGoFood = new BigDecimal(0.1);
    protected BigDecimal diskonShopeeFood = new BigDecimal(0.2);

    public abstract String getNama();

    public abstract BigDecimal getHarga();

    public void info() {
        System.out.println(String.format("%s harga %s", getNama(), getHarga()));
    }

}
