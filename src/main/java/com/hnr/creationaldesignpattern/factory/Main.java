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
public class Main {
 
    public static void main(String[] args) {
        Manusia manusia1 = ManusiaFactory.buatManusia(Manusia.JenisKelamin.PRIA, "Yohanes");
        manusia1.info();
        Manusia manusia2 = ManusiaFactory.buatManusia(Manusia.JenisKelamin.PRIA, "Andrew");
        manusia2.info();
        Manusia manusia3 = ManusiaFactory.buatManusia(Manusia.JenisKelamin.WANITA, "Maria");
        manusia3.info();
        ManusiaFactory.info();
    }
    
}
