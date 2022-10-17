package com.company;

import java.awt.*;

public class Hesap {
    private String kullanıcıAdı;
    private String parola;
    private int bakiye;

    public Hesap() {

    }

    public Hesap(String kullanıcıAdı, String parola, int bakiye) {
        this.kullanıcıAdı = kullanıcıAdı;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullacıAdı() {
        return kullanıcıAdı;
    }

    public void setKullacıAdı(String kullacıAdı) {
        this.kullanıcıAdı = kullacıAdı;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void showInfo(){
        System.out.println("kullanıcı adı = " + this.getKullacıAdı());
        System.out.println("parola = " + this.getParola());
        System.out.println("bakıye"  + this.getBakiye());
    }
    public void paraEkle(int para){
        int toplam = this.getBakiye() + para;
        this.setBakiye(toplam);
    }
    public void paraCıkar(int para){
        if(this.getBakiye()<para){
            System.out.println("Bakıye yetersiz");
        }
        else{
            int kalan = this.getBakiye()-para;
            this.setBakiye(kalan);
        }
    }

}
