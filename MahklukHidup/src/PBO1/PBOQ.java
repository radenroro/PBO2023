/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1;
import mahklukhidup.MahklukHidup;
import mahklukhidup.Hewan;

/**
 *
 * @author Lenovo
 */
public class PBOQ {
    public static void main(String[] args) {
    Hewan Chinchilla = new Hewan();
    Chinchilla.setNama_latin("Chinchilla");
    Chinchilla.setFamillia("Chinchillidae");
    Chinchilla.setAsal("Amerika Selatan");
    Chinchilla.setCiri_khusus("Wajahnya merupakan perpaduan wajah kelinci & tikus");
    Chinchilla.setMakanan("Biji-bijian");
    Chinchilla.setWarna("Abu-abu");
    Chinchilla.setReproduksi("Vivipar/Melahirkan");
    Chinchilla.setAlat_pernapasan("Paru-paru");
    Chinchilla.setHabitat("Pegunungan");
    System.out.println("Nama makhluk hidup "+Chinchilla.getNama_latin());
    System.out.println("Anggota famillia "+Chinchilla.getFamillia());
    System.out.println("Berasal dari "+Chinchilla.getAsal());
    System.out.println("Memiliki ciri khusus yaitu "+Chinchilla.getCiri_khusus());
    System.out.println("Memakan "+Chinchilla.getMakanan());
    System.out.println("Biasanya berwarna "+Chinchilla.getWarna());
    System.out.println("Berkembang biak dengan "+Chinchilla.getReproduksi());
    System.out.println("Bernapas dengan "+Chinchilla.getAlat_pernapasan());
    System.out.println("Habitat asal ada di "+Chinchilla.getHabitat());
    
    
    }
}
