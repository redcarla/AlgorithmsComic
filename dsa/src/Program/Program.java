package Program;

public class Program {
    public static void main(String args[]) throws Exception {
        Converter converter = new Converter();
        converter.Converter();
        converter.printArray();
        DcChar[] t = converter.returnArray();
        LinkedList linkedlist = new LinkedList();
        Stack s = new Stack();
        Queue q = new Queue();
        for(int i = 0; i < t.length; i++){
            linkedlist.append(t[i]);
            q.enqueue(t[i]);
            s.push(t[i]);

        }
        //linkedlist.printList();
        System.out.println(q.dequeue());
        System.out.println(s.pop());


    }
}
