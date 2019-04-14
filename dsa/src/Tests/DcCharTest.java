package Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Program.*;

import javax.swing.plaf.synth.SynthLookAndFeel;

import static org.junit.jupiter.api.Assertions.*;

class DcCharTest {
    DcChar test = new DcChar();
    DcChar test2 = new DcChar();
    @BeforeEach
    void setUp() throws Exception {

        test.setName("Ramon");
        test.setId("Ramon");
        test.setSex("Man");
        test.setAlign("Good");
        test.setEye("red");
        test.setHair("red");
        test.setGSM("red");
        test.setAlive("yes");
        test.setappearance("Ugly");
        test.setFAppearance("Ugly");
        test.setYear("1997");
        test2.setName("Carla");

    }

    @Test
    void setName() {
        Assertions.assertEquals("Ramon", test.getName());
    }

    @Test
    public void getName() {
        Assertions.assertEquals("Ramon", test.getName());
    }


    @Test
    void setId() {
        Assertions.assertEquals("Ramon", test.getId());
    }

    @Test
    void getId() {
        Assertions.assertEquals("Ramon", test.getId());
    }

    @Test
    void setSex() {
        Assertions.assertEquals("Man", test.getSex());
    }

    @Test
    void getSex() {
        Assertions.assertEquals("Man", test.getSex());
    }

    @Test
    void setAlign() {
        Assertions.assertEquals("Good", test.getAlign());
    }

    @Test
    void getAlign() {
        Assertions.assertEquals("Good", test.getAlign());
    }

    @Test
    void setEye() {
        Assertions.assertEquals("red", test.getEye());
    }

    @Test
    void getEye() {
        Assertions.assertEquals("red", test.getEye());
    }

    @Test
    void setHair() {
        Assertions.assertEquals("red", test.getHair());
    }

    @Test
    void getHair() {
        Assertions.assertEquals("red", test.getHair());
    }

    @Test
    void setGSM() {
        Assertions.assertEquals("red", test.getGSM());
    }

    @Test
    void getGSM() {
        Assertions.assertEquals("red", test.getGSM());
    }

    @Test
    void setAlive() {
        Assertions.assertEquals("yes", test.getAlive());
    }

    @Test
    void getAlive() {
        Assertions.assertEquals("yes", test.getAlive());
    }

    @Test
    void setappearance() {
        Assertions.assertEquals("Ugly", test.getAppearance());
    }

    @Test
    void getAppearance() {
        Assertions.assertEquals("Ugly", test.getAppearance());
    }

    @Test
    void setFAppearance() {
        Assertions.assertEquals("Ugly", test.getFAppearance());
    }

    @Test
    void getFAppearance() {
        Assertions.assertEquals("Ugly", test.getFAppearance());
    }

    @Test
    void setYear() {
        Assertions.assertEquals("1997", test.getYear());
    }

    @Test
    void getYear() {
        Assertions.assertEquals("1997", test.getYear());
    }


    @Test
    void compareTo() {
        int result = test.compareTo(test2);
        assertEquals(result,15);
    }
    @Test
    void search() throws Exception {
        SequentialSearch b = new SequentialSearch();
        Converter converter = new Converter();
        converter.Converter("dc");
        DcChar[] t = converter.returnArray();
        DcChar Ramon = t[500];
        b.search(t, Ramon);
    }
}