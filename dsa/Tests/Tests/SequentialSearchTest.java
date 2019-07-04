package Tests;

import Program.Converter;
import Program.DcChar;
import Program.SequentialSearch;
import org.junit.jupiter.api.Test;

class SequentialSearchTest {

    @Test
    void search() throws Exception{
        SequentialSearch s = new SequentialSearch();
        Converter converter = new Converter();
        converter.Converter("dc");
        DcChar[] w = converter.returnArray();
        DcChar Carla = w[700]; //won't actually display carla :') just data from object 700 but object is CALLED carla
        s.search(w, Carla);

    }

}