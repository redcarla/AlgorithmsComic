package Program;

import java.util.ArrayList;
import java.util.Scanner;

public class LinkedList<T> {
    Node head;                                      // head of list
    int length = 0;



    public void prepend(T new_data)                    //prepend new node to the front of the list
    {

        Node new_node = new Node(new_data);         //initialize & enter data


        new_node.next = head;

        head = new_node;                            //move head to point to new node
        length++;
    }

    public void insertAfter(Node prev_node, T new_data)                 //insert new node after a given node
    {

        if (prev_node == null)                                          //check nulls
        {
            System.out.println("Previous node can't be null");
            return;
        }


        Node new_node = new Node(new_data);

        new_node.next = prev_node.next;                                 //make next of new node next of prev_node


        prev_node.next = new_node;                                      //make next of prev_node new_node
        length++;
    }


    public void append(T new_data)                                      //add to end
    {
        length++;
        Node new_node = new Node(new_data);


        if (head == null)                                               //if list is empty, make this the head
        {
            head = new Node(new_data);
            return;
        }


        new_node.next = null;                                           //make next node null


        Node last = head;                                               //keep going till the end
        while (last.next != null)
            last = last.next;


        last.next = new_node;                                           //change next of last

        return;
    }


    public void printList()                                             //print starting from a given node
    {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    /*public DcChar[] toArray() {
        Node tnode = head;
        int i=0;
        DcChar[] array = new DcChar[length+1];
        if(tnode == null){
            return null;
        }

        while (tnode != null){

            i++;
            array[i] = (DcChar) tnode.data;
        }
        return array;
    }
*/
    class Node<T> {

        T data;                                     //node data
        Node next;                                  //pointer to next node


        Node(T d) {                                  //constructor
            data = d;
            next = null;
        }
    }
}

