/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testyfitnessefixture;

import fit.ColumnFixture;
import java.time.LocalDate;
import java.util.Date;
import java.util.IllegalFormatCodePointException;

/**
 *
 * @author Dominika
 */
public class TestRezerwacja extends ColumnFixture {
    String daneFilmu[], daneKlienta[];
    
    public boolean zlozRezerwacje() {
        try {
            Date data = new Date();
            String s = SetUp.wypozyczalnia.zlozRezerwacje(daneKlienta[0], daneFilmu, data);
            if (s == "Rezerwacja dodana") return true;
        } catch (IllegalFormatCodePointException e) {}
        return false;
    }
    
}
