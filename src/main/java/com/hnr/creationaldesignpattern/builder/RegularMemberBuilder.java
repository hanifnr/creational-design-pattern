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
public class RegularMemberBuilder extends MemberBuilder {

    public RegularMemberBuilder(String nama, BigDecimal harga, int jumlahBulan) {
        setNama(nama);
        setHarga(harga);
        setJumlahBulan(jumlahBulan);
    }

    @Override
    public MemberBuilder setJumlahBulan(int jumlahBulan) {
        return super.setJumlahBulan(jumlahBulan); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Member build() {
        return new Member(this);
    }

}
