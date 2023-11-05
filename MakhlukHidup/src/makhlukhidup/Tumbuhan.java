/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makhlukhidup;

/**
 *
 * @author Lenovo
 */
public class Tumbuhan extends MakhlukHidup {
    private String jenisTumbuhan;

    
    public Tumbuhan(String nama, String jenisTumbuhan) {
        super(nama); // Memanggil konstruktor superclass MakhlukHidup dengan argumen nama
        this.jenisTumbuhan = jenisTumbuhan;
    }

    
    public Tumbuhan(String nama) {
        super(nama); // Memanggil konstruktor superclass MakhlukHidup dengan argumen nama
        this.jenisTumbuhan = "Tidak Diketahui";
    }

    
    public Tumbuhan() {
        super("Tumbuhan Default");
        this.jenisTumbuhan = "Tidak Diketahui";
    }

    public void fotosintesis() {
        System.out.println(getNama() + " adalah sejenis " + jenisTumbuhan + " dan sedang melakukan fotosintesis.");
    }

    public void tumbuh() {
        System.out.println(getNama() + " adalah sejenis " + jenisTumbuhan + " dan sedang tumbuh.");
    }

    
}

