/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.creationaldesignpattern.abstractfactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hanifnr
 */
public class Main {

    public static void main(String[] args) {
        Makanan hanif = AplikasiFactory.getAplikasi(AplikasiFactory.Aplikasi.GOFOOD).getAyamGeprek();
        Makanan bibil = AplikasiFactory.getAplikasi(AplikasiFactory.Aplikasi.GOFOOD).getBakso();
        Makanan koko = AplikasiFactory.getAplikasi(AplikasiFactory.Aplikasi.SHOPEEFOOD).getAyamGeprek();
        Makanan ardha = AplikasiFactory.getAplikasi(AplikasiFactory.Aplikasi.SHOPEEFOOD).getBakso();

        List<Makanan> list = new ArrayList<>(Arrays.asList(hanif, bibil, koko, ardha));

        for (Makanan makanan : list) {
            makanan.info();
        }
    }

}
