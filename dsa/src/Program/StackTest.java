package Program;

import Program.Converter;
import Program.DcChar;
import Program.Stack;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack b;
    @Before
    public void setup() throws Exception {

    }

    @Test
    public void push() throws Exception{
        b = new Stack();
        Converter converter = new Converter();
        converter.Converter();
        DcChar[] t = converter.returnArray();
        for(int i = 0; i < t.length; i++){
            b.push(t[i]);
        }
        DcChar Ramon = new DcChar();
        Ramon.setName("Ramon");
        b.push(Ramon);
        DcChar result = (DcChar) b.peek();
        System.out.println(result.getName());
        assertEquals(result, b.pop());

    }

    @Test
    public void pop() {
    }

    @Test
    public void peek() {
    }

    @Test
    public void length() {
    }
}