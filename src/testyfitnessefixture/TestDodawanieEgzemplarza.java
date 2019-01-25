/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testyfitnessefixture;

import fit.ColumnFixture;
import java.util.IllegalFormatCodePointException;

/**
 *
 * @author Dominika
 */
public class TestDodawanieEgzemplarza extends ColumnFixture{
    String dane[];
    int idEgzemplarza;
    
    public boolean dodajEgzemplarz() {
        try {
            String s = SetUp.wypozyczalnia.dodajEgzemplarz(dane, idEgzemplarza);
            if (s == "Egzemplarz dodany") return true;
        }   catch (IndexOutOfBoundsException e) {}
            catch (IllegalFormatCodePointException e) {}
        return false;
    }
}
