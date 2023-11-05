/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makhlukhidup;

/**
 *
 * @author Lenovo
 */
public class Hewan extends MakhlukHidup {
    private String jenisHewan;

    
    public Hewan(String nama, String jenisHewan) {
        super(nama); 
        this.jenisHewan = jenisHewan;
    }

    public Hewan(String nama) {
        super(nama); // 
        this.jenisHewan = "Tidak Diketahui";
    }

    
    public Hewan() {
        super("Hewan Default"); 
        this.jenisHewan = "Tidak Diketahui";
    }

    public void makan() {
        System.out.println(getNama() + " adalah sejenis " + getJenisHewan() + " dan makan biji-bijian.");
    }

    public void bergerak() {
        System.out.println(getNama() + " adalah sejenis " + getJenisHewan() + " dan sedang bergerak.");
    }

    /**
     * @return the jenisHewan
     */
    public String getJenisHewan() {
        return jenisHewan;
    }

    /**
     * @param jenisHewan the jenisHewan to set
     */
    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }
}
 
