package Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Program.*;
import static org.junit.jupiter.api.Assertions.*;

class StupidBubbleAlgoTest {

    private Converter converter;

    @BeforeEach
    void setUp() throws Exception {
        
        Converter converter = new Converter();
        converter.Converter("dc");
        
    }

    @Test
    void stupidBubble() throws Exception {
        Converter converter = new Converter();
        converter.Converter("dc");
        StupidBubbleAlgo b = new StupidBubbleAlgo();
        DcChar[] r = converter.returnArray();
        b.stupidSort(r);
    }
}