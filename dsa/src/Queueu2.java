import java.util.*;

class GfG {

    static class Stack2<T>
    {
        // Two inbuilt queues
        static Queue<String> q1 = new Queue<>();
        static Queue<String> q2 = new Queue<>();

        // To maintain current number of
        // elements
        static int curr_size;

        Stack2()
        {
            curr_size = 0;
        }

        void push(String x)
        {
            curr_size++;

            // Push x first in empty q2
            q2.enqueue(x);

            // Push all the remaining
            // elements in q1 to q2.


            // swap the names of two queues
            Queue<String> q = q1;
            q1 = q2;
            q2 = q;
        }

        static void pop(){
            q1.dequeue();
            curr_size--;
        }

        static QNode top()
        {
            return q1.dequeue();
        }

        static int size()
        {
            return curr_size;
        }
    };

    // driver code
    public static void main(String[] args)
    {
        Stack2 s = new Stack2();
        s.push("1");
        s.push("3");
        s.push("3");

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());

        System.out.println("current size: " + s.size());
    }
}  