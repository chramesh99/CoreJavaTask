package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("1.Employee");
        System.out.println("2.Manager");
        System.out.println("3.Employer");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user option: ");
        int userOption = sc.nextInt();
        switch(userOption){
            case 1:{
                Employee employee = new Employee();
                employee.create();
                employee.write();
                employee.read();
                break;
            }
            case 2: {
                Manager Manager = new Manager();
                Manager.create();
                Manager.write();
                Manager.read();
                Manager.delete();
                break;
            }
            case 3:{
                Employer employer = new Employer();
                employer.create();
                employer.write();
                employer.read();
                employer.delete();
                break;
            }
            case 4:{
                break;
            }
        }
    }
}
