/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pbolagi;
import food.Food;
import food.Tumis;
import food.Kuah;
/**
 *
 * @author Lenovo
 */
public class Jalan {
    public static void main(String[] args) {
        Tumis Kangkung = new Tumis();
        System.out.println("Tumis kangkung enak dimakan " + Kangkung.getDimakan());
        System.out.println("Tumis kangkung cocok untuk " + Kangkung.JamMakan());
        System.out.println("                                   ");
        Kuah Ramen = new Kuah();
        System.out.println("Ramen enak disantap " + Ramen.getDimakan());
        System.out.println("Lezat ketika " + Ramen.JamMakan(20.00));
        Ramen.daging();
        Ramen.mie();
        Ramen.pangsit();
        System.out.println("                                   ");
        Food pizza = new Food();
        System.out.println("Pizza enak dimakan " + pizza.getDimakan());
        System.out.println("Mantap ketika  " + pizza.JamMakan(19.00));
    }
}
