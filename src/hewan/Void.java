/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Void {
   //Deklarasi variabel dan nilai
    int pilihan;
    
    void pengelompokanhewan (){
        Scanner input = new Scanner (System.in);
        //Menjalankan Program
        System.out.print("Masukkan pilihan : ");
        pilihan = input.nextInt();
        if (pilihan==1)
        System.out.println("Herbivora : Kambing, Kelinci, Kuda");
        else if(pilihan==2)
        System.out.println("Karnivora : Singa, Serigala, Harimau");
        else if(pilihan==3)
        System.out.println("Omnivora : Monyet, Beruang, Babi");
        else
        System.out.println("Bukan Hewan");
        System.out.println("++++++++++++++++++++++++");
        
    }
    
    void bergerak (){
        Scanner input = new Scanner(System.in);
             
        System.out.print("Masukkan nama hewan : ");
        String nama_hewan = input.next();
        
        System.out.print("Masukkan jumlah kata : ");
        int jumlah =  input.nextInt();
        
        System.out.print("Masukkan kata : ");
        String kata = input.next();
        
        for (int i = 1; i <= jumlah; i++) {
            System.out.println(kata); 
            
        }
    }
            
}       
       

