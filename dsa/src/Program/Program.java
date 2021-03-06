package Program;

public class Program {
    public LinkedList linkedlist = new LinkedList();
    public Stack s = new Stack();
    public Queue q = new Queue();
    public DoublyLL dl = new DoublyLL();
    public BinaryST bst = new BinaryST();
    public Converter converter = new Converter();

    public static void main(String args[]) throws Exception {

        Program p = new Program();                              //create structures
        p.fill("dc");                                   //fill with data
        p.print();                                              //print
    }


                                                                // fill the data structures
    public void fill(String fileName) throws Exception {
        converter.Converter(fileName);
        converter.printArray();
        DcChar[] t = converter.returnArray();
        for (int i = 0; i < t.length; i++) {
            linkedlist.append(t[i]);
            q.enqueue(t[i]);
            s.push(t[i]);
            dl.append(t[i]);
            bst.insert(t[i]);

        }
    }

    public void print() {                                       // print the data structures
        linkedlist.printList();
        System.out.println(q.dequeue());
        System.out.println(s.pop());
        dl.printlist(dl.head);
        bst.preOrder();
    }
}



