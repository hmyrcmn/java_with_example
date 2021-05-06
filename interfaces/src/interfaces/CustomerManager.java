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
public class CustomerManager {
    
    final ICustomerDal customerDal;
    public CustomerManager(ICustomerDal CustomerDal){
    this.customerDal=CustomerDal;
    
    }
    public void add(){
        customerDal.add();
    }
    
}
