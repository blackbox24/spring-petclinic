package com.example;


public class MyMainClass {

   
    public int sum(int a,int b) {
        return a + b;
    }
    public static void main(String[] args) {
	MyMainClass myClass = new MyMainClass();
	int n = myClass.sum(1,2);
        System.out.println(n);
    }
}
