package com.belajar;
import java.util.*;
public class whileLoop {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int a=0;
        boolean k = true;
        System.out.println("awal program");

        while (k){
            System.out.println("aksi ke- " + a);
            a++;
            if(a==10){
                k = false;
            }
        }
        System.out.println("akhir");
    }
}
