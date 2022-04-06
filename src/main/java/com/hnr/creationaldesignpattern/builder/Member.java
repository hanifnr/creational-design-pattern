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
public class Member {

    String nama, kartuKredit = "";
    BigDecimal harga;
    int jumlahBulan;
    boolean usePT, isAerobik;

    public Member(RegularMemberBuilder builder) {
        this.nama = builder.nama;
        this.harga = builder.harga;
        this.jumlahBulan = builder.jumlahBulan;
        this.usePT = builder.usePT;
        this.isAerobik = builder.isAerobik;
    }

    public Member(VipMemberBuilder builder) {
        this.nama = builder.nama;
        this.kartuKredit = builder.kartuKredit;
        this.harga = builder.harga;
        this.jumlahBulan = builder.jumlahBulan;
        this.usePT = builder.usePT;
        this.isAerobik = builder.isAerobik;
    }

    private BigDecimal hitungHarga() {
        BigDecimal percentage = BigDecimal.ZERO;
        BigDecimal baseHarga = harga.multiply(new BigDecimal(jumlahBulan));
        BigDecimal additional = ((usePT ? new BigDecimal(100000) : BigDecimal.ZERO).add((isAerobik ? new BigDecimal(50000) : BigDecimal.ZERO))).multiply(new BigDecimal(jumlahBulan));

        if (kartuKredit.length() > 0) {
            switch (jumlahBulan) {
                case 4:
                    percentage = new BigDecimal(5);
                    break;
                case 8:
                    percentage = new BigDecimal(10);
                    break;
                case 12:
                    percentage = new BigDecimal(15);
                    break;
                default:
                    break;
            }
        }

        BigDecimal diskon = baseHarga.multiply(percentage).divide(new BigDecimal(100));

        return baseHarga.subtract(diskon).add(additional);
    }

    public void info() {
        BigDecimal harga = hitungHarga();

        System.out.println(String.format("Nama: %s \n"
                + "Kartu kredit: %s \n"
                + "Jumlah bulan: %s \n"
                + "Menggunakan PT: %s \n"
                + "Kelas aerobik: %s \n"
                + "Harga: %s \n",
                nama,
                kartuKredit,
                jumlahBulan,
                usePT,
                isAerobik,
                harga));
    }

}
