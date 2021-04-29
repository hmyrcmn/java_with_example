/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daytwo;

/**
 *
 * @author humey
 */
public class Person {
    String name;
    String manager;
    int age;
    double totalEducatıon;
    
    public Person(){
        System.out.println("kişi newlendi");
    
    }
    public Person (String name,String manager,int age,double totalEducatıon){
        this.name=name;
        this.manager=manager;
        this.age=age;
        this.totalEducatıon=totalEducatıon;
    }
    
}
