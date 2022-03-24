/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.creationaldesignpattern.abstractfactory;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author hanifnr
 */
public class CalcUtil {

    public static BigDecimal hitungHarga(BigDecimal harga, BigDecimal diskon) {
        return harga.subtract(harga.multiply(diskon)).setScale(2, RoundingMode.DOWN);
    }

}
