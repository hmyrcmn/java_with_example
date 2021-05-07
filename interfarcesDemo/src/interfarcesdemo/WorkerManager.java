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

public class WorkerManager {
    
    final IWorkable workable;
    public WorkerManager(IWorkable workable){
        this.workable=workable;
    
    }
    public void work(){
        workable.work();
    }
    
    
    
    
}
