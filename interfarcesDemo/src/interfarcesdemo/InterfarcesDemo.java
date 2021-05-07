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
public class InterfarcesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WorkerManager workerManager=new WorkerManager(new Robot);
        workerManager.work();
         
        
        
    }
    
}
