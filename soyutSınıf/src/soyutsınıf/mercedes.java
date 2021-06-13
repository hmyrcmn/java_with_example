/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soyutsınıf;

/**
 *
 * @author humey
 */
public class mercedes implements Arac{

    @Override
    public String model() {
        return "cla200";
    }

    @Override
    public int agırlık() {
        return 12000;
    }

    @Override
    public String cekiş() {
       return "çift çeker ";
    }

    @Override
    public String tarih() {
        return "01.04.2004";
    }
    
}
