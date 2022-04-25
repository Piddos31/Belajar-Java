package com.belajar;
import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int a = 0;
        boolean k = true;
        System.out.println("awal");
        do {
            a++;
            System.out.println("do while ke "+a);
            if (a==11){
                k = false;
            }
        }while (k);
        System.out.println("akhir");
    }
}
