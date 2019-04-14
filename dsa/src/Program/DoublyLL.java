package Program;

class DoublyLL<T> {
    Node head;                                                     // head of list

    public void prepend(T new_data)                                  //add to front
    {
        Node new_Node = new Node(new_data);                      //allocate data
        new_Node.next = head;                                    //make next head and previous null
        new_Node.prev = null;
        if (head != null)                                        //change prev of head to new
            head.prev = new_Node;
        head = new_Node;                                            //move head to point to new node
    }

    public void insertAfter(Node prev_Node, T new_data)           //insert after given node
    {
        if (prev_Node == null) {                                    //check if previous is null
            System.out.println("Previous node can't be null");
            return;
        }

        Node new_node = new Node(new_data);                         //put in data
        new_node.next = prev_Node.next;                             //next of new node to next of previous
        prev_Node.next = new_node;                                  //make next of previous node as new node
        new_node.prev = prev_Node;                                  //make prev_node previous of new node
        if (new_node.next != null)                                  //change previous of new_node next node
            new_node.next.prev = new_node;
    }

    public void append(T new_data)                                   // Add a node at the end of the list
    {
        Node new_node = new Node(new_data);                         //add data
        Node last = head;
        new_node.next = null;                                       //next is null because last node is new
        if (head == null) {                                         //if empty
            new_node.prev = null;
            head = new_node;
            return;
        }

        while (last.next != null)                               //keep going till the last node
            last = last.next;
        last.next = new_node;                                   //change next of last
        new_node.prev = last;                                   //make last previous
    }

    public void printlist(Node node)                            //print starting at a given point
    {
        Node last = null;
        System.out.println("Going forward:");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println("\n");
        System.out.println("Going backwards:");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    class Node<T> {                                                    //node
        T data;
        Node prev;
        Node next;


        Node(T d) {                                                    //constructor
            data = d;
        }
        // next and previous node null by default
    }
}

