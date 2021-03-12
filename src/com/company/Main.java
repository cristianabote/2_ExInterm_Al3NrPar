package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Scrie un program care afiseaza in intervalul dat de la tastatura ,al treilea nr par
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti intervalul dorit: cele doua valori,cea mai mica initial apoi cea mai mare");
        int a=scan.nextInt();
        int b=scan.nextInt();
        if(a<b) {
            int contor = 0;
            for (int i = a; i <= b; i++)
                if (i % 2 == 0) {
                    contor++;
                    if (contor == 3)
                        System.out.println("Al treilea numar par din intervalul dat este : " + i);
                }
        } else
            System.out.println("Intervalul introdus este eronat.");
    }
}
