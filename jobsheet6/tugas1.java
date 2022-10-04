// Created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package jobsheet6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Ella Dwipujana Asyani
 */
public class tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        BufferedReader nilai = new BufferedReader (new InputStreamReader(System.in));
	String a =  " ";
	String b = " ";
	String c = " ";
        
    try {
            System.out.print("Nilai pertama: " );
            a = nilai.readLine();
            System.out.print("Nilai kedua: " );
            b = nilai.readLine();
            System.out.print("Nilai ketiga: ");
            c = nilai.readLine();	
	}catch(IOException e) 
            {
		System.out.println("-");
            }
	
		int angka1;
		int angka2;
		int angka3;
		
		angka1 = Integer.parseInt(a);
		angka2 = Integer.parseInt(b);
		angka3 = Integer.parseInt(c);
		
		double rata_rata = (angka1 + angka2 + angka3)/ 3;
		System.out.println("\nNilai rata-rata : " + rata_rata);
      
		
		if ((rata_rata <= 90)  && (rata_rata >= 60)) {
			System.out.println(":-)");
		}
		else {
			System.out.println(":-(");    
    }
}
}