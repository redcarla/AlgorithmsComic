package Tests;

import Program.Program;
import org.junit.jupiter.api.Test;

class ProgramTest {

    @Test
    void main() throws Exception {
        Program p = new Program();
        p.fill("marvel");
        p.print();


    }


}