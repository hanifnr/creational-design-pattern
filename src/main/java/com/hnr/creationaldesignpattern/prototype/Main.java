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
public class Main {

    public static void main(String[] args) {
        BaksoBuilder defaultBakso = new BaksoBuilder(2, 2, 1);
        Bakso gg = defaultBakso.clone().build();
        Bakso hanif = defaultBakso.clone().setSambal(true).build();

        gg.info();
        hanif.info();
    }

}
