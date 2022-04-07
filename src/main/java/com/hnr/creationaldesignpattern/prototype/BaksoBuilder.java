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
public class BaksoBuilder {

    int pentol;
    int gorengan;
    int tahu;
    int lontong;
    boolean sambal;
    boolean saus;

    public BaksoBuilder(int pentol, int gorengan, int tahu) {
        this.pentol = pentol;
        this.gorengan = gorengan;
        this.tahu = tahu;
    }

    public BaksoBuilder(BaksoBuilder baksoBuilder) {
        this.pentol = baksoBuilder.pentol;
        this.gorengan = baksoBuilder.gorengan;
        this.tahu = baksoBuilder.tahu;
        this.lontong = baksoBuilder.lontong;
        this.sambal = baksoBuilder.sambal;
        this.saus = baksoBuilder.saus;
    }

    public BaksoBuilder setLontong(int lontong) {
        this.lontong = lontong;
        return this;
    }

    public BaksoBuilder setSambal(boolean sambal) {
        this.sambal = sambal;
        return this;
    }

    public BaksoBuilder setSaus(boolean saus) {
        this.saus = saus;
        return this;
    }

    public Bakso build() {
        return new Bakso(this);
    }

    public BaksoBuilder clone() {
        return new BaksoBuilder(this);
    }

}
