/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package food;

/**
 *
 * @author Lenovo
 */
public class Food {
    private String JenisMakanan;
    private String Asal;
    private String Dimakan = "Selagi Hangat";
    public String JamMakan() {
        return "Sarapan ";
    }
    public String JamMakan(int Waktu) {
        return "Dimakan saat " + "waktunya" + String.valueOf(Waktu);
    }
    public String JamMakan(double Waktu) {
        return "Dimakan saat " + "waktunya" + String.valueOf(Waktu);
    }
    /**
     * @return the JenisMakanan
     */
    public String getJenisMakanan() {
        return JenisMakanan;
    }

    /**
     * @param JenisMakanan the JenisMakanan to set
     */
    public void setJenisMakanan(String JenisMakanan) {
        this.JenisMakanan = JenisMakanan;
    }

    /**
     * @return the Asal
     */
    public String getAsal() {
        return Asal;
    }

    /**
     * @param Asal the Asal to set
     */
    public void setAsal(String Asal) {
        this.Asal = Asal;
    }

    /**
     * @return the Dimakan
     */
    public String getDimakan() {
        return Dimakan;
    }

    /**
     * @param Dimakan the Dimakan to set
     */
    public void setDimakan(String Dimakan) {
        this.Dimakan = Dimakan;
    }
    public Food() {
        this.Dimakan = "Selagi Hangat ";
    }
    
       
}
