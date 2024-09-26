/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author 62898
 */
public class Balok extends BangunRuang{
    double panjang, lebar, tinggi;
    
    public Balok(double panjang, double lebar, double tinggi){
        super (panjang, lebar);
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public double volume (){
        return panjang*lebar*tinggi;
    }
    public double luasPermukaan(){
        return 2*(panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
    
}