package Program;

public class Program {

    public static void main(String args[]) throws Exception {
        Converter converter = new Converter();
        converter.Converter();
        converter.printArray();
        DcChar[] t = converter.returnArray();

        //create
        LinkedList linkedlist = new LinkedList();
        Stack s = new Stack();
        Queue q = new Queue();
        DoublyLL dl = new DoublyLL();
        BinaryST bst = new BinaryST();

        //fill
        for(int i = 0; i < t.length; i++) {
            linkedlist.append(t[i]);
            q.enqueue(t[i]);
            s.push(t[i]);
            dl.append(t[i]);
            bst.insert(t[i]);

    }
        //print
            linkedlist.printList();
            System.out.println(q.dequeue());
            System.out.println(s.pop());
            dl.printlist(dl.head);
            bst.preOrder();
        }


    }

//todo: insertion sort algo test
//todo: converter test

