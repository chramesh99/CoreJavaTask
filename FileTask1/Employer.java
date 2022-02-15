package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Employer {
    String fileName;
    public void create() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        fileName = sc.next();
        File file = new File(fileName);
        file.createNewFile();
    }

    public void write() throws Exception{
        PrintWriter pw = new PrintWriter(fileName);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text in to the file:");
        pw.println(sc.nextLine());
        pw.flush();
        pw.close();
    }
    public void read() throws Exception{
        System.out.println("The content in the file is: ");
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
    public void delete() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file path to delete: ");
        String filePath = sc.nextLine();
        File fileDelete = new File(filePath);
        if (fileDelete.delete()){
            System.out.println("successfully delete the file" + filePath);
        }
        else{
            System.out.println("Failed to delete the file" + filePath);
        }
    }
}
class Manager extends Employer{
    String fileName;
    public void create() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        fileName = sc.next();
        File file = new File(fileName);
        file.createNewFile();
    }

    public void write() throws Exception{
        PrintWriter pw = new PrintWriter(fileName);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text in to the file:");
        pw.println(sc.nextLine());
        pw.flush();
        pw.close();
    }
    public void read() throws Exception{
        System.out.println("The content in the file is: ");
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
    public void delete() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file path to delete: ");
        String filePath = sc.nextLine();
        File fileDelete = new File(filePath);
        if (fileDelete.delete()){
            System.out.println("successfully delete the file" + filePath);
        }
        else{
            System.out.println("Failed to delete the file" + filePath);
        }
    }
}
