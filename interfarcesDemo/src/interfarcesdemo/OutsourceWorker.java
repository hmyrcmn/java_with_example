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
public class OutsourceWorker extends Workers implements IWorkable,IEatable{

    @Override
    public void work() {
        System.out.println("çalışır! ");
    }

    @Override
    public void eat() {
        double price ;
        price=10;
        System.out.println("yemek yiyebilir !! ücretli "+price);
    }
    
}
