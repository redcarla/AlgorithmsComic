package Program;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortAlgoTest {

    @Test
    void insSort() throws Exception{
        InsertionSortAlgo i = new InsertionSortAlgo();
        Converter converter = new Converter();
        converter.Converter();
        DcChar[] t = converter.returnArray();
        i.insSort(t);


    }
}