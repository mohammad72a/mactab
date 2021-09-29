package hw8;

import java.io.IOException;

public class ExceptionTester {
    public static void main(String[] args){
        try {
            throw new ExceptionA("ExceptionA");
        }catch (Exception exception){
            System.out.println(exception.toString());
        }
        try {
            throw new ExceptionB("ExceptionB");
        }catch (Exception exception){
            System.out.println(exception.toString());
        }
        try {
            throw new NullPointerException();
        }catch (Exception exception){
            System.out.println(exception.toString());
        }
        try {
            throw new IOException();
        }catch (Exception exception){
            System.out.println(exception.toString());
        }
    }
    }

