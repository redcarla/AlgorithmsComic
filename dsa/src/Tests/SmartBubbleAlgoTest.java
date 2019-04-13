package Tests;

import org.junit.jupiter.api.Test;
import Program.*;
import static org.junit.jupiter.api.Assertions.*;

class SmartBubbleAlgoTest {

    @Test
    void smartBubble() throws Exception {
        SmartBubbleAlgo b = new SmartBubbleAlgo();
        Converter converter = new Converter();
        converter.Converter();
        DcChar[] t = converter.returnArray();
        DcChar Ramon = t[500];
        b.smartBubble(t);
    }


}