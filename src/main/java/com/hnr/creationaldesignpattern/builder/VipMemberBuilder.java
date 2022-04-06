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
public class VipMemberBuilder extends MemberBuilder {

    String kartuKredit;

    public VipMemberBuilder(String nama, BigDecimal harga, int jumlahBulan, String kartuKredit) {
        setNama(nama);
        setHarga(harga);
        setJumlahBulan(jumlahBulan);
        setKartuKredit(kartuKredit);
    }

    private MemberBuilder setKartuKredit(String kartuKredit) {
        this.kartuKredit = kartuKredit;
        return this;
    }

    @Override
    public Member build() {
        return new Member(this);
    }

}
