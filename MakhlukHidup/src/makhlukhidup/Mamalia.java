/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makhlukhidup;

/**
 *
 * @author Lenovo
 */
public class Mamalia extends Hewan {
    protected int jumlahAnak; 

    public Mamalia(String nama, int jumlahAnak) {
        super(nama);
        this.jumlahAnak = jumlahAnak;
    }

    public Mamalia(String nama) {
        super(nama);
        this.jumlahAnak = 0; // Mengatur jumlah anak menjadi 0 jika tidak disediakan
    }

    public Mamalia() {
        super("Mamalia Default");
        this.jumlahAnak = 0;
    }

    public void menyusui() {
        System.out.println(getNama() + " adalah sejenis mamalia dan sedang menyusui " + getJumlahAnak() + " anaknya.");
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
}
