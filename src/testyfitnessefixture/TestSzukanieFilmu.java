/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testyfitnessefixture;

import fit.ColumnFixture;
import java.util.IllegalFormatCodePointException;
import wypozyczalnia.Film;

/**
 *
 * @author Dominika
 */
public class TestSzukanieFilmu extends ColumnFixture {
    String dane[];
    
    public boolean szukajFilmu() {
        Film film = new Film(dane);
        try {
            Film f = SetUp.wypozyczalnia.szukajFilmu(film);
            if (f != null) return true;
        } catch (IllegalFormatCodePointException e) {}
        return false;
    }
}
