/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfarcesdemo;

/**
 *
 * @author humey
 */
public class Worker extends Workers implements IWorkable,IEatable,IPayable,IAllowable{

    @Override
    public void work() {
        System.out.println("çalışır ");
    }

    @Override
    public void eat() {
        double price =0;
        System.out.println("yemek yer ücretsiz !"+price );
    }

    @Override
    public void pay() {
        System.out.println("maaş ödenir ! ");
    }

    @Override
    public void allowable() {
        System.out.println("izin alabilir ");
    }
    
}
