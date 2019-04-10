public class BinaryST<T extends Comparable<T>> { //extends comparable to compare values

    Node root;              //root

    public void insert(T value) {        //add new value to tree
        if (isEmpty())
            root = new Node(value);  //root node added
        else
            insert(root, value);  //if not empty then insert based on root
    }

    private void insert(Node node, T value) {    //recursion that inserts at the right place
        if (value.compareTo(node.value) < 0) {  //if new value less than parent node
            if (node.left == null)               //if left null then add
                node.left = new Node(value);
            else
                insert(node.left, value);  //if left not null then recursive call
        } else if (value.compareTo(node.value) >= 0) {  //if new value same or greater than parent node
            if (node.right == null)                  //if right null then add
                node.right = new Node(value);
            else
                insert(node.right, value);           //if right not null then recursive call
        }
    }

    public boolean isEmpty() {                   //checks if tree is empty
        return (root == null) ? true : false;
    }

    public void preOrderHelper(Node node) {        //traversal recursion
        if (node != null) {
            node.visit();
            preOrderHelper(node.left);
            preOrderHelper(node.right);
        }
    }

    public void inOrderHelper(Node node) {
        if (node != null) {
            inOrderHelper(node.left);
            node.visit();
            inOrderHelper(node.right);
        }
    }

    public void postOrderHelper(Node node) {
        if (node != null) {
            postOrderHelper(node.left);
            postOrderHelper(node.right);
            node.visit();
        }
    }

    public void preOrder() {        //preorder traversal
        if (root != null) {
            preOrderHelper(root);
        }
    }

    public void inOrder() {         //inorder traversal
        if (root != null) {
            inOrderHelper(root);
        }
    }

    public void postOrder() {       //postorder traversal
        if (root != null) {
            postOrderHelper(root);
        }
    }

    class Node {
        T value;            //value of node
        Node right, left;     //pointer to left and right sub-tree

        Node(T value) {
            this.value = value;
        }

        public void visit() {   //print out line
            System.out.print(this.value + " ");
        }
    }
}

