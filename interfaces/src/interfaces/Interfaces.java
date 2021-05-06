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
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // interface lerde abstaract lar gibi newlenmez
        // interface onu implement eden class ın referansını tutabilir 
        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        CustomerManager customerManager2=new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
        customerManager2.add();
        
    }
    
}
