/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author 62898
 */
public class Kubus extends BangunRuang {
    double sisi;

    public Kubus(double sisi) {
        super(sisi, sisi);
        this.sisi = sisi;
    }
    @Override
    public double volume(){
        return sisi*sisi*sisi;
    }
    public double luasPermukaan(){
        return 6*sisi*sisi;
    }  
}
