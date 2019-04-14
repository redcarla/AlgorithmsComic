package Program;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void main() throws Exception {
        Program p = new Program();
        p.fill("dc");
        p.print();


    }


}