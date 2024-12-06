package com.example.exThymeleaf;

public class Main {

    public static void main(String[] args) {
        String classPath = System.getProperty("java.class.path");
        String[] classPaths = classPath.split(";");

        for (String item : classPaths) {
            System.out.println(item);
        }
    }
}
