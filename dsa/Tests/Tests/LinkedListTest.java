package Tests;

import Program.DcChar;
import Program.LinkedList;
import org.junit.jupiter.api.Test;

class LinkedListTest {

    @Test
    void LinkedList() {
        LinkedList l = new LinkedList();
        DcChar Char1 = new DcChar();
        DcChar Char2 = new DcChar();
        DcChar Char3 = new DcChar();
        l.append(Char1);
        l.prepend(Char2);
        l.insertAfter(l.head, Char3);
        l.printList();
    }
}