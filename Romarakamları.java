/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romarakamları;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Romarakamları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Roma rakamlarının gösterimi"+"\nI= 1"+"\nV= 5"+"\nX=10"+"\nL=50"+"\nC=100"+"\nD=500"+"\nM=1000"+"\nSayıyı giriniz");
        String sayi, sayi2;
        
        Scanner scanner = new Scanner(System.in);
        sayi = scanner.nextLine();
        
        rakamlar rakam = new rakamlar();
       
        while (rakam.kurallar(sayi)== false){
            sayi = scanner.nextLine();
        }
        
        rakam.setRomaRakami(sayi);
        
        sayi2 = scanner.nextLine();
        
        rakamlar rakam2 = new rakamlar(sayi2);
        
        while (rakam.kurallar(sayi2)== false){
            sayi2 = scanner.nextLine();
        }        
        
        rakam2.setRomaRakami(sayi2);
        
        System.out.println(rakam.romaRakamlariTopla(sayi, sayi2));
        
    }
    
}
