/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package makhlukhidup;

/**
 *
 * @author Lenovo
 */
public class MakhlukHidup {
    private String nama;
    private int umur;

    public MakhlukHidup() {
        this.nama = "Makhluk";
        this.umur = 0;
    }

    public MakhlukHidup(String nama) {
        this.nama = nama;
        this.umur = 0;
    }

    public MakhlukHidup(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    

}
