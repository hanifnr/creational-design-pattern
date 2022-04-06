/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.creationaldesignpattern.builder;

/**
 *
 * @author hanifnr
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        Member hanif = director.createVipMember("Hanif", "9842039480290", Director.Month.EMPAT).setUsePT(true).build();
        Member bibil = director.createRegularMember("Bibil").setJumlahBulan(2).setIsAerobik(true).build();

        hanif.info();
        bibil.info();
    }

}
