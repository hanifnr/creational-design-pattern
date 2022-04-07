/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.creationaldesignpattern.prototype;

/**
 *
 * @author hanifnr
 */
public class Bakso {

    int pentol;
    int gorengan;
    int tahu;
    int lontong;
    boolean sambal;
    boolean saus;

    public Bakso(BaksoBuilder builder) {
        this.pentol = builder.pentol;
        this.gorengan = builder.gorengan;
        this.tahu = builder.tahu;
        this.lontong = builder.lontong;
        this.sambal = builder.sambal;
        this.saus = builder.saus;
    }

    public void info() {
        System.out.println(String.format("Pentol: %s, Gorengan: %s, Tahu: %s, Lontong: %s, Pakai sambal: %s, Pakai saus: %s",
                pentol, gorengan, tahu, lontong, sambal, saus));
    }

}
