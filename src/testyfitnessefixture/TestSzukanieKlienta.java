/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testyfitnessefixture;

import fit.ColumnFixture;
import java.util.IllegalFormatCodePointException;
import wypozyczalnia.ProfilKlienta;

/**
 *
 * @author Dominika
 */
public class TestSzukanieKlienta extends ColumnFixture {
    String dane[];

    public boolean szukajKlienta() {
        ProfilKlienta pk = new ProfilKlienta(dane);
        try {
            ProfilKlienta wynik = SetUp.wypozyczalnia.szukajKlienta(pk);
            if (wynik != null) return true;
        } catch (IllegalFormatCodePointException e) {}
        return false;
    }
}
