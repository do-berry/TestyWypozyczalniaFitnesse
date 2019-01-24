/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testyfitnessefixture;

import fit.ColumnFixture;
import wypozyczalnia.Film;

/**
 *
 * @author Dominika
 */
public class TestDodawanieFilmu extends ColumnFixture{
    String dane[];
    
    public boolean dodajFilm() {
        int s1 = ileFilmow();
        SetUp.wypozyczalnia.dodajFilm(dane);
        Film film = new Film(dane);
        int s2 = ileFilmow();
        //String dane1 = Film.toString(dane);
        return (SetUp.wypozyczalnia.szukajFilmu(film)) != null && s1!=s2;
    }
    
    public int ileFilmow() {
        return SetUp.wypozyczalnia.filmy.size();
    }
    
}
