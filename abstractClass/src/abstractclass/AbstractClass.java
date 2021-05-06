/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author humey
 */

public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //GamerCalculator gamers=new GamerCalculator();// abstarct classlar newlwnemez
        GamerCalculator gameCalculaters=new WomanGamerCalculator();
        gameCalculaters.gameOver();
        gameCalculaters.hesapla();// 90 verri  woman için override edildiği şekli gelir !!!
        
        
    }

    
    
}
