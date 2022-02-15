package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception{
        Employee obj = new Employee(101,"dundi","Trainee");
        Employee obj1 = new Employee(102,"venkat","Trainee");
        Employee obj2 = new Employee(103,"naga","Trainee");
        Employee obj3 = new Employee(104,"kalayan","Trainee");
        ArrayList<Employee> list = new ArrayList<>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        File empFile = new File("Employee.txt");
        PrintWriter pw = new PrintWriter(empFile);
        pw.println(list);
        empFile.setWritable(false);
        empFile.setWritable(true);
        pw.println("Hai....!");
        pw.flush();
        pw.close();

    }
}
