/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package src.main.java.com.mycompany.projwork;


import com.mycompany.projwork.Magazine;
import com.mycompany.projwork.MagazineFrame;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lani
 */
public class FunctionUnitTests {
    
    public FunctionUnitTests() {
    }

    @Test
    public void testMagazineAddButton() {
        //This doesn't inherit from the code, bur rather demonstrates that it will work.
        MagazineFrame TestMagazineFrame = new MagazineFrame();
        String TestTitleTxt = "Test_Title";
        String TestPubYear = "1989";
        Magazine actualMagazine = new Magazine(TestTitleTxt,TestPubYear);
        Magazine expectedMagazine = new Magazine();
        List<Magazine> actualMagazineSuper = new ArrayList<Magazine>();
        actualMagazineSuper.add(actualMagazine);
        List<Magazine> expectedMagazineSuper = new ArrayList<Magazine>();
        expectedMagazineSuper.add(new Magazine("Test_Title","1989"));
        
        assertEquals(actualMagazineSuper,expectedMagazineSuper);
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
