package com.belajar;
import java.util.*;
public class KalkulatorSwirch {
    public static void main(String[] argh){
        Scanner user;
        user = new Scanner(System.in);
        float a,b;
        String op;
        float hasil;
        System.out.println("==================================");
        System.out.println("Operator yang tersedia +,-,/,*");
        System.out.println("==================================\n");
        System.out.print("nilai a = ");
        a = user.nextFloat();
        System.out.print("operator = ");
        op = user.next();
        System.out.print("nilai b = ");
        b = user.nextFloat();

        switch (op){
            case "+":
                System.out.println("Penjumlahan");
                hasil = a + b;
                System.out.println("" + a + " " +op+ " " + b + " = " + hasil);
                break;
            case "-":
                System.out.println("Pengurangan");
                hasil = a - b;
                System.out.println("" + a + " " +op+ " " + b + " = " + hasil);
                break;
            case "/":
                System.out.println("Pembagian");
                hasil = a / b;
                System.out.println("" + a + " " +op+ " " + b + " = " + hasil);
                break;
            case "*":
                System.out.println("Perkalian");
                hasil = a * b;
                System.out.println("" + a + " " +op+ " " + b + " = " + hasil);
                break;
            default:
                System.out.println("Operator " +op+ " tidak ada");
        }
        System.out.println("Terima kasih");
    }
}
