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
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String angka=" ";
        
        angka=JOptionPane.showInputDialog("Masukkan Angka : ");
        int a = Integer.valueOf(angka).intValue();
        
        String hasil ="";
        
        if((a>=1) && (a<=10)) {
            System.out.println(hasil += "Valid Number");
        }
        else {
            System.out.println(hasil += "Invalid Number");
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
