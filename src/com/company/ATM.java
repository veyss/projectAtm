package com.company;

import java.util.Scanner;

public class ATM {
    private boolean durum;

    public void calıs(Hesap hesap) {
        System.out.println("Adil Banka Hoşgeldiniz");
        System.out.println("**********");
        System.out.println("Kullancı girş bilgileri");
        System.out.println("*****************");
        Login SystemLogin = new Login();

        for (int i = 1; i < 4; i++) {
            boolean durum = SystemLogin.login(hesap);
            if (durum) {
                System.out.println(i + ". deneme giriş başarılı");
                break;
            } else {
                System.out.println(i + ". deneme giriş barasız");
                if (i == 3) {
                    return;
                }
            }
        }
        Scanner scanner = new Scanner(System.in);

        int islem = -1;
        while (islem != 4) {
            System.out.println("********************");
            System.out.println("1 = para çekmek için 1 i tuslayınız");
            System.out.println("2 = para yatırmak için 2 yı tuslayınız");
            System.out.println("3 = bakıye bilgesi için 3 u tuslayınız");
            System.out.println("4 = çıkış için 4 tuslayınız");
            System.out.println("********************");
            islem = scanner.nextInt();
            if (islem == 1) {
                System.out.println("çekmek istediğniz ucret");
                int cekilenPara = scanner.nextInt();
                //hesap.paraCıkar(cekilenPara);
                int kalanPara = hesap.getBakiye() - cekilenPara;
                hesap.setBakiye(kalanPara);

            } else if (islem == 2) {
                System.out.println("yatırmak istediğniz ucret");
                int yatırlanPara = scanner.nextInt();
               // hesap.paraEkle(yatırlanPara);
                int toplamPara = hesap.getBakiye() + yatırlanPara;
                hesap.setBakiye(toplamPara);
            } else if (islem == 3) {
                System.out.println(hesap.getBakiye());
            }
            if (islem == 4) {
                System.out.println("iyi gunler");
            }


        }

    }
}
