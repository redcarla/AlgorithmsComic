package Program;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequentialSearchTest {

    @Test
    void search() throws Exception{
        SequentialSearch s = new SequentialSearch();
        Converter converter = new Converter();
        converter.Converter();
        DcChar[] t = converter.returnArray();
        DcChar Carla = t[700]; //won't actually display carla :') just data from object 700 but object is CALLED carla
        s.search(t, Carla);

    }

}