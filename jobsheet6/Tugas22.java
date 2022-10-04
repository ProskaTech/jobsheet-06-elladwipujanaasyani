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
public class Tugas22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String angka="";
        
        angka=JOptionPane.showInputDialog("Masukkan Angka : ");
        int a=Integer.valueOf(angka).intValue();
        
        String hasil="";
        switch(a) {
            case 1: hasil += "Valid Number";
            break;
            case 2: hasil += "Valid Number";
            break;
            case 3: hasil += "Valid Number";
            break;
            case 4: hasil += "Valid Number";
            break;
            case 5: hasil += "Valid Number";
            break;
            case 6: hasil += "Valid Number";
            break;
            case 7: hasil += "Valid Number";
            break;
            case 8: hasil += "Valid Number";
            break;
            case 9: hasil += "Valid Number";
            break;
            case 10: hasil += "Valid Number";
            break;
            default: hasil += "Invalid Number";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
