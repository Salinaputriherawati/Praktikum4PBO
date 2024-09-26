/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author 62898
 */
public class BangunRuangMain {
    public static void main(String[] args ){
        Kubus kubus = new Kubus(5);
        Balok balok = new Balok(4, 3, 2);
        
        System.out.println("Kubus:");
        System.out.println("Volume: " + kubus.volume());
        System.out.println("Luas Permukaan: " + kubus.luasPermukaan());

        System.out.println("\nBalok:");
        System.out.println("Volume: " + balok.volume());
        System.out.println("Luas Permukaan: " + balok.luasPermukaan());
        
    }
}
