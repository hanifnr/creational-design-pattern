/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.creationaldesignpattern.builder;

import java.math.BigDecimal;

/**
 *
 * @author hanifnr
 */
public class Director {

    public static enum Month {
        EMPAT, DELAPAN, DUABELAS
    };
    BigDecimal harga = new BigDecimal(200000);

    public RegularMemberBuilder createRegularMember(String nama) {
        RegularMemberBuilder builder = new RegularMemberBuilder(nama, harga, 1);
        return builder;
    }

    public VipMemberBuilder createVipMember(String nama, String kartuKredit, Month month) {
        int m = 0;
        switch (month) {
            case EMPAT ->
                m = 4;
            case DELAPAN ->
                m = 8;
            case DUABELAS ->
                m = 12;
        }
        VipMemberBuilder builder = new VipMemberBuilder(nama, harga, m, kartuKredit);
        return builder;
    }

}
