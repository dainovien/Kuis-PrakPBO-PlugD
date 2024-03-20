/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis.prakpbo.pkg123220215;

/**
 *
 * @author HP
 */
public class PerhitunganSikuImpl implements PerhitunganSiku {
    @Override
    public double hitungSiku(double alas, double tinggi) {
        return Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2)); // Menggunakan rumus sisi miring segitiga siku-siku
    }
}

