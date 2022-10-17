package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void toplama(int sayı1, int sayı2){
        System.out.println(sayı1+sayı2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("kullanıcı adı belirleyınız");
        String kullanıcıAdı= scanner.nextLine();
        System.out.println("şifre belirleyınız");
        String paralo= scanner.nextLine();

        int bakıye= random.nextInt(1000);
        Hesap adilHesap= new Hesap();
        adilHesap.setKullacıAdı(kullanıcıAdı);
        adilHesap.setParola(paralo);
        adilHesap.setBakiye(bakıye);

       // Hesap bugraHesap = new Hesap(kullanıcıAdı,paralo,bakıye);
        ATM atm = new ATM();
        atm.calıs(adilHesap);
       // adilHesap.showInfo();
       // System.out.println("******");
      //  bugraHesap.showInfo();
        System.out.println("islem sonlandı");
    }
}
