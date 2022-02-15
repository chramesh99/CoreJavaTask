package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            CsvFileClass.writeFile();
            CsvFileClass.read();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
