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
public class Robot extends Workers implements IWorkable{

    @Override
    public void work() {
        System.out.println("çalışır ");
    }

   
    
}
