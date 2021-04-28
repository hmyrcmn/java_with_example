/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asalmı;

/**
 *
 * @author humey
 */
import java.awt.BorderLayout;
import java.util.Scanner;

public class Asalmı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("hangi sayının kontrolunu yapmak istiyorsunuz  aralık  01 100 aralıgı ");
        Scanner input =new Scanner(System.in);
        int number =input.nextInt();
        int tut=0;
        if (number<100 && number>0){
            
            for (int i=2;i<number;i++){// if you want to more succes than this time i<number/2 did
                if(number % i == 0)
                    tut+=1;
            
            }
            if (tut==0){
                System.out.println("sayı asaldır "+ number+" "+ tut );
            }
            else{
                System.out.println("asal değil "+number+" "+tut);}
        
        }
        else{
            System.out.println("lütfen belirtilen arlaıkta ki sayısı giriniz ");
        }
    }
    
}
