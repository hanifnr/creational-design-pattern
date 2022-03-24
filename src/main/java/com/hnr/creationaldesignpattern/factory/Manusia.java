/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.creationaldesignpattern.factory;

/**
 *
 * @author hanifnr
 */
public abstract class Manusia {
    
    enum JenisKelamin{PRIA, WANITA}
    
    protected String nama;
    protected JenisKelamin jenisKelamin;

    public Manusia(String nama, JenisKelamin jenisKelamin) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }
    
    public void info() {
        System.out.println(String.format("%s berjenis kelamin %s", nama, jenisKelamin));
    }
    
}
