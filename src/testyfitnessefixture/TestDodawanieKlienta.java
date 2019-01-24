/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testyfitnessefixture;

import fit.ColumnFixture;
import java.util.IllegalFormatCodePointException;
import testyfitnessefixture.SetUp;

/**
 *
 * @author Dominika
 */
public class TestDodawanieKlienta extends ColumnFixture{
    String dane[];
    
    public boolean dodajKlienta() throws IllegalFormatCodePointException {
        int s1 = ileKlientow();
        try {
            SetUp.wypozyczalnia.dodajKlienta(dane);
            int s2 = ileKlientow();
            return s1!=s2;
        } catch (IllegalFormatCodePointException e) {
            return false;
        }
    }
    
    public int ileKlientow() {
        return SetUp.wypozyczalnia.klienci.size();
    }
}
