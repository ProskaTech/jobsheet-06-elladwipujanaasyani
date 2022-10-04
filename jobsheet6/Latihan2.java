// Created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package jobsheet6;

import java.util.Scanner;
/**
 *
 * @author Ella Dwipujana Asyani
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        double total_pembelian, diskon = 0;
        
        Scanner dataMasuk = new Scanner(System.in);
        System.out.println("Masukkan Total Pembelian : Rp ");
        total_pembelian = dataMasuk.nextDouble();
        
        if (total_pembelian >= 50000){
            diskon = 0.1 * total_pembelian;
        }
        else
            diskon = 0.02 * total_pembelian;
        
        System.out.println("Besarnya diskon : Rp " + diskon);
    }
}
