// Created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package jobsheet6;

import javax.swing.JOptionPane;

/**
 *
 * @author Ella Dwipujana Asyani
 */
public class Tugas11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String a="", b=" ", c=" ";
        
        a=JOptionPane.showInputDialog("Nilai Pertama : ");
        int angka1=Integer.valueOf(a).intValue();
        b=JOptionPane.showInputDialog("Nilai Kedua : ");
        int angka2=Integer.valueOf(b).intValue();
        c=JOptionPane.showInputDialog("Nilai Ketiga : ");
        int angka3=Integer.valueOf(c).intValue();
        
        double rata_rata=(angka1+angka2+angka3)/3;
        
        String hasil=" ";
        hasil += "Nilai pertama : " +angka1;
        hasil += "Nilai kedua   : " +angka2;
        hasil += "Nilai ketiga  : " +angka3;
        hasil += "Nilai rata rata : " +rata_rata;
        
        if ((rata_rata <= 9) &&  (rata_rata >= 60)) {
        System.out.println(hasil += "\nGood Job :-) ");
    }
        else{
                System.out.println(hasil += "\n Failed :-( ");
                }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
