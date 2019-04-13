package Tests;

import Program.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchAlgoTest {

    @Test
    void binSearch() throws Exception {
        BinarySearchAlgo b = new BinarySearchAlgo();
        Converter converter = new Converter();
        converter.Converter();
        converter.printArray();
        DcChar[] t = converter.returnArray();
        DcChar Ramon = t[500];
        b.search(t, Ramon);
    }

}