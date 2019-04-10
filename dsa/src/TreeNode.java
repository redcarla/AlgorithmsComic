public class TreeNode<T extends Comparable<T>> {
    T element;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T o) {          //constructor
        this.element = o;
        this.left = null;
        this.right = null;
    }

    public TreeNode() {             //constructor
        this.element = null;
        this.left = null;
        this.right = null;
    }

    public void insert(T o) {
        //if (element.compareTo(o) < 0) {
            if (right == null) {
                right = new TreeNode<T>(o);
            } else {
                right.insert(o);
            }
    //    } else if (element.compareTo(o) > 0) {
            if (left == null) {
                left = new TreeNode<T>(o);
            } else {
                left.insert(o);
            }
        }
  //  }

    public void visit() {
        System.out.print(this.element + " ");
    }
}