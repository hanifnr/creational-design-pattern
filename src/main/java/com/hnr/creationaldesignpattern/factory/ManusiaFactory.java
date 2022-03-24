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
public class ManusiaFactory {
    
    public static int jumlahPria, jumlahWanita;
    
    public static Manusia buatManusia(Manusia.JenisKelamin jk, String nama) {
        switch(jk) {
            case PRIA -> {
                jumlahPria ++;
                return new Pria(nama);
            }
            case WANITA -> {
                jumlahWanita ++;
                return new Wanita(nama);
            }
        }
        return null;
    }
    
    public static void info() {
        System.out.println(String.format("Jumlah pria : %d \nJumlah Wanita : %d", jumlahPria, jumlahWanita));
    }
    
}
