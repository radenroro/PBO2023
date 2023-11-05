/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makhlukhidup;
/**
 *
 * @author Lenovo
 */
public class PBO {
    public static void main(String[] args) {
    Mamalia Chinchilla = new Mamalia();
    Chinchilla.setNama("Chinchilla"); 
    Chinchilla.setUmur(5);
    Chinchilla.setJenisHewan("Pengerat");
    Chinchilla.setJumlahAnak(2);
    Chinchilla.makan();
    Chinchilla.menyusui();
    System.out.println(Chinchilla.getNama()+ " sedang bernapas.");
    System.out.println(Chinchilla.getUmur()+ " tahun.");
    System.out.println(Chinchilla.getNama()+ " sedang bergerak.");
    System.out.println( "Merupakan Hewan "+Chinchilla.getJenisHewan());
    System.out.println("Memiliki anak sebanyak "+Chinchilla.getJumlahAnak());
    



    
    }
}
