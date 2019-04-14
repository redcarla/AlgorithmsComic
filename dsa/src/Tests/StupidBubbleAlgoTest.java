package Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Program.*;
import static org.junit.jupiter.api.Assertions.*;

class StupidBubbleAlgoTest {

    private Converter converter2;

    @BeforeEach
    void setUp() throws Exception {
        
        Converter converter2 = new Converter();
        converter2.Converter("dc");
        
    }

    @Test
    void stupidBubble() throws Exception {
        StupidBubbleAlgo b = new StupidBubbleAlgo();
        DcChar[] r = converter2.returnArray();
        b.stupidSort(r);
    }
}