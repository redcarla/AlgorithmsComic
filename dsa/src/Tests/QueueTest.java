package Tests;

import Program.DcChar;
import Program.Queue;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
