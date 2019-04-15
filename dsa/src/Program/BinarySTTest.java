package Program;

import Program.BinaryST;
import Program.DcChar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySTTest {
    BinaryST d;
    @BeforeEach
    public void SetUp(){
        BinaryST d = new BinaryST<>();
    }

    @Test
    void insert() {
        BinaryST d = new BinaryST<>();
        DcChar Char1 = new DcChar();
        Char1.setName("Ramon");
        d.insert(Char1);
        d.insert(Char1);
    }

    @Test
    void isEmpty() {
        BinaryST d = new BinaryST<>();
        boolean result = d.isEmpty();
        assertEquals(result, true);
    }
}