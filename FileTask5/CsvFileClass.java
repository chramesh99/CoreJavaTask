package com.company;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CsvFileClass {
    int empId;
    String empName;
    String empRole;

    public CsvFileClass(int empId, String empName, String empRole) {
        this.empId = empId;
        this.empName = empName;
        this.empRole = empRole;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpRole() {
        return empRole;
    }

    @Override
    public String toString() {
        return
                empId +
                ", " + empName +
                ", " + empRole ;
    }
    public static void writeFile() throws Exception{
        CsvFileClass obj = new CsvFileClass(101,"dundi","T");
        CsvFileClass obj1 = new CsvFileClass(102,"dundi","T");
        CsvFileClass obj2 = new CsvFileClass(103,"dundi","T");
        CsvFileClass obj3 = new CsvFileClass(104,"dundi","T");
        CsvFileClass obj4 = new CsvFileClass(105,"dundi","T");
        ArrayList<CsvFileClass> list = new ArrayList<>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        PrintWriter pw = new PrintWriter("Data.csv");
        for(CsvFileClass emp : list){
            pw.println(emp);
        }
        pw.close();
    }
    public static void read() throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("Data.csv"));
        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
