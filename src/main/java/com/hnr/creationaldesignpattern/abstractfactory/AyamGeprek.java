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
public abstract class AyamGeprek extends Makanan {

    @Override
    public String getNama() {
        return "Ayam Geprek";
    }

    @Override
    public BigDecimal getHarga() {
        return new BigDecimal(12000);
    }

}
