/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makhlukhidup;

/**
 *
 * @author Lenovo
 */
public class Berbunga extends Tumbuhan {
    protected String jenisBunga;

    
    public Berbunga() {
        jenisBunga = "Tidak Diketahui";
    }

    
    public Berbunga(String jenisBunga) {
        this.jenisBunga = jenisBunga;
    }

    
    public Berbunga(String jenisBunga, String warna) {
        this.jenisBunga = jenisBunga;
        System.out.println("Warna: " + warna);
    }
}
