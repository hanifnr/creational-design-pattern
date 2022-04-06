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
public abstract class MemberBuilder {

    protected String nama;
    protected BigDecimal harga;
    protected int jumlahBulan;
    protected boolean usePT, isAerobik;

    protected MemberBuilder setNama(String nama) {
        this.nama = nama;
        return this;
    }

    protected MemberBuilder setHarga(BigDecimal harga) {
        this.harga = harga;
        return this;
    }

    protected MemberBuilder setJumlahBulan(int jumlahBulan) {
        this.jumlahBulan = jumlahBulan;
        return this;
    }

    public MemberBuilder setUsePT(boolean usePT) {
        this.usePT = usePT;
        return this;
    }

    public MemberBuilder setIsAerobik(boolean isAerobik) {
        this.isAerobik = isAerobik;
        return this;
    }

    public abstract Member build();
}
