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
public class Course {
        String name;
	String teacher;
	int totalHour;
	double loading;
	
	public Course() {
		System.out.println("kurs bilgileri cont paramtereli"+this.name);
		
	}
	public Course(String name,String teacher,int totalHour,double loading) {
		this.name=name;
		this.teacher=teacher;
		this.totalHour=totalHour;
		this.loading=loading;
		
	}
}
