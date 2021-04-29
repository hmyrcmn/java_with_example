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
public class DayTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Course kurs= new Course();
        kurs.name="java";
        kurs.teacher="engin demirog";
        kurs.totalHour=30*24;
        kurs.loading=1.2;
        
        Course kurs2=new Course("csharp","engin demirog",25*24,5.5);
        System.out.println("kurs bilgileri"+kurs.name+kurs.teacher);
        System.out.println("2. kurs bilgileri"+kurs2.name+kurs2.teacher);
        
        Course kurs3=new Course("hazırlık","engin deöirog",1,10.0);
        System.out.println("kurs 3 bilgileri"+kurs3.name+kurs3.teacher);
        // tip ad = oluştur newle
        Course[] courses ={kurs,kurs2,kurs3};
        System.out.println("sistemde ne kadar kurs var "+courses.length);
        
        CourseManager courseManager=new CourseManager();
        courseManager.add(kurs);
        courseManager.add(kurs2);
        //totaleducatıon katıldıgı kurs sayısı
        Person person =new Person("hümeyra","computer engineering ",20,2);
        Person person2=new Person("engin", "yazılım", 1, 4.4);
        
        Person[] persons={person,person2};
        System.out.println("sistemde kaç ögrenci var "+persons.length);
        
    }
    
}
