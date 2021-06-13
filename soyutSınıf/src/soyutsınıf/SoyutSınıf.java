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
public class SoyutSınıf {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Arac arac1=new mercedes();
        //interfaces newlenebilir 
        System.out.println("bilgiler : "+arac1.cekiş()+arac1.model()+ " "+arac1.tarih());
    }
    
}
