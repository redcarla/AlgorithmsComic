package Tests;

import Program.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortAlgoTest {

    @Test
    public void QuickSort() throws Exception {
        QuickSortAlgo b = new QuickSortAlgo();
        Converter converter = new Converter();
        converter.Converter("marvel");
        DcChar[] t = converter.returnArray();
        b.quickSort(t);
        converter.printArray();
    }
}