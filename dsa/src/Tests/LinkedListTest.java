package Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Program.*;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void LinkedList() {
        LinkedList l = new LinkedList();
        DcChar Char1 = new DcChar();
        DcChar Char2 = new DcChar();
        DcChar Char3 = new DcChar();
        l.append(Char1);
        l.prepend(Char2);
        l.printList();
    }
}