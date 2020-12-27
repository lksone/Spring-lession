package com.demo.volidate;

public class VolidateDemo {

   static volatile int a =0;


    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        a = 1;
        i++;
        j++;
    }
}
