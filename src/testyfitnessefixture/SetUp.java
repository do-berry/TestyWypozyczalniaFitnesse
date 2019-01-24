/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testyfitnessefixture;

import fit.Fixture;
import wypozyczalnia.Wypozyczalnia;
/**
 *
 * @author Dominika
 */
public class SetUp extends Fixture {
    public static Wypozyczalnia wypozyczalnia;
    public SetUp() {
        wypozyczalnia = new Wypozyczalnia();
    }
}
