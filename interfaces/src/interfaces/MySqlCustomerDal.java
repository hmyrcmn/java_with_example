/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author humey
 */
public class MySqlCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("my sql eklendi : ");
    }
    
}
