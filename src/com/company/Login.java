package com.company;

import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kullanıcı adı giriniz");
        String kullanıcıAdı = scanner.nextLine();
        System.out.println("Parola giriniz");
        String parola = scanner.nextLine();
        if (kullanıcıAdı.equals(hesap.getKullacıAdı())) {
            if (parola.equals(hesap.getParola())) {
                // System.out.println("Giriş basarılı");
                return true;
            } else {
                //System.out.println("şifreniz hatalı");
                return false;
            }
        } else {
            //System.out.println("kullanıcı adınız yanlış");
            return false;
        }

    }
}
