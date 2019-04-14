package Program;

public class Queue<T> {
    public int length;
    QNode<T> front;
    QNode<T> rear;

    public Queue() {
        this.front = this.rear = null;
    }

    // Method to add a key to the queue.
    public void enqueue(T key) {

        // Create a new node
        QNode<T> temp = new QNode<>(key);

        // If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
        length++;
    }

    // Method to remove a key from queue.
    public T dequeue() {
        // If queue is empty, return NULL.
        if (this.front == null)
            return null;

        // Store previous front and move front one node ahead
        QNode<T> temp = this.front;
        this.front = this.front.next;

        // If front becomes NULL, then change rear also as NULL
        if (this.front == null)
            this.rear = null;
        return temp.key;
    }

    public class QNode<T> {
        T key;
        QNode<T> next;

        // constructor to create a new linked list node
        public QNode(T key) {
            this.key = key;
            this.next = null;
        }
    }


}