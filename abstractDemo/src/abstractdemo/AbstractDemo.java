/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractdemo;

/**
 *
 * @author humey
 */
public class AbstractDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CustomerManager customerManager = new CustomerManager();
        customerManager.databasemanager = new SqlDateBaseManager();
        customerManager.databasemanager=new OracleDatabaseManager();
        customerManager.getCustomers();
        
    }
   
}
