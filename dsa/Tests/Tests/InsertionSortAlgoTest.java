package Tests;

import Program.Converter;
import Program.DcChar;
import Program.InsertionSortAlgo;
import org.junit.jupiter.api.Test;

class InsertionSortAlgoTest {

    @Test
    void insSort() throws Exception{
        InsertionSortAlgo i = new InsertionSortAlgo();
        Converter converter = new Converter();
        converter.Converter("marvel");
        DcChar[] t = converter.returnArray();
        i.insSort(t);


    }
}