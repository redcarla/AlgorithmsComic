class Node<T extends Comparable<T>> {
    private T value;
    private Node<T> left;
    private Node<T> right;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}


class BST <T extends Comparable<T>> {
    private Node<T> root;

    public BST(T value) {
        root = new Node<T>(value);
    }

    public void insert(T value) {
        Node<T> node = new Node<T>(value);

        private void insert(Node node, T value){
            if(value.compareTo(node.value) < 0){  //if new value less than parent node
                if(node.left == null)  //if left null then add
                    node.left = new Node(value);
                else
                    insert(node.left,value);  //if left not null then recursive call
            }
            else if(value.compareTo(node.value) >= 0){  //if new value same or greater than parent node
                if(node.right == null)  //if right null then add
                    node.right = new Node(value);
                else
                    insert(node.right,value);  //if right not null then recursive call
            }
        }

        /**
         * Returns the value of the root
         * @return
         */
        public T peek(){
            return root.value;
        }

        /**
         * Checks if tree is empty or not
         * @return
         */
        public boolean isEmpty(){
            return (root == null)? true : false;
        }
    }
    }
}


