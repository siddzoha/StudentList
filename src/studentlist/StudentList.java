/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentlist;

import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class StudentList {

   
    public static void main(String[] args) {
        Student[] studList=new Student[5];
        
        //studList[0]=new Student("Micheal","1","SDNE");
    
        Scanner input=new Scanner(System.in);
        
        for(int i=0;i<studList.length;i++)
        {
            studList[i]=new Student();
            System.out.println("Enter Student Name: ");
            studList[i].setStudName(input.nextLine());
        }
        
        for(int i=0;i<studList.length;i++)
        {
            System.out.println("Student Name: "+studList[i].getStudName());
        }
    }

}
