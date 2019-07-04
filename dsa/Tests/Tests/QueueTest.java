package Tests;

import Program.DcChar;
import Program.Queue;
import org.junit.jupiter.api.Test;

public class QueueTest {



    @Test
    void enqueue() {
        DcChar test = new DcChar();
        DcChar test2 = new DcChar();
        Queue q = new Queue();;

        test.setName("Ramon");
        q.enqueue(test);
        System.out.println(test);
        DcChar t = (DcChar) q.dequeue();
    }

    @Test
    public void dequeue() {

    }
}
