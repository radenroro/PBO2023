/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package food;

/**
 *
 * @author Lenovo
 */
public class Kuah extends Food implements Bakso, WontonSoup, Ramen{
    @Override
    public void daging() {
        System.out.println("Enak dimakan dengan sambal");
    }

    @Override
    public void pangsit() {
        System.out.println("Enak dimakan dengan Chilli Oil");
    }

    @Override
    public void mie() {
        System.out.println("Enak dimakan dengan bubuk cabe");
    }
    
}
