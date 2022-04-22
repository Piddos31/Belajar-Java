package com.belajar;
import java.util.*;
public class kalkulatorIF {
    public static void main(String[] args) {
        Scanner userInput ;
        float a,b,hasil;
        char operator;
        System.out.println("==============================================");
        System.out.println("operator yang tersedia ialah");
        System.out.println("1. + (penjumlahan)");
        System.out.println("2. - (pengurangan)");
        System.out.println("3. * (perkalian)");
        System.out.println("4. / (pembagian)");
        System.out.println("==============================================\n");
        userInput = new Scanner(System.in);
        System.out.print("Nilai a = ");
        a=userInput.nextFloat();
        System.out.print("Masukkan operator = ");
        operator = userInput.next().charAt(0);
        System.out.print("Nilai b = ");
        b=userInput.nextFloat();

        System.out.println("INPUTAN : " + a + " " + operator + " " +b );
        if(operator== '+'){
            hasil = a + b;
            System.out.println("" + a + " " + operator + " " +b+ " = "+hasil);
        }else if(operator== '-'){
            hasil = a - b;
            System.out.println(" " + a + " " + operator + " " +b+ " = "+hasil);
        }else if(operator== '*'){
            hasil = a * b;
            System.out.println(" " + a + " " + operator + " " +b+ " = "+hasil);
        }else if(operator== '/'){
            if(b==0){
                System.out.println("pembagian 0 memiliki nilai tak hinga");
            }else{
                hasil = a / b;
                System.out.println(" " + a + " " + operator + " " +b+ " = " +hasil);
            }
        }else {
            System.out.println("operator tak terdeteksi");
        }
        System.out.println("Terimakasih");
    }
}