package Program;

public class BinarySearchAlgo {

    public static <T extends Comparable<T>> int binSearch(T[] structure, int first, int last, T search) {
        int key;
        int mid = first + (last - first) / 2;                       //find middle point
        if (first > last) {
            key = -1;
        } else if (search.compareTo(structure[mid]) < 0) {
            key = binSearch(structure, first, mid - 1, search);
        } else {
            key = binSearch(structure, mid + 1, last, search);
        }
        return key;

    }

    public <T extends Comparable<T>> void search(T[] data, T key) {
        int position = binSearch(data, 0, data.length, key) + 1;

        System.out.print("Item: " + key + " is at position: " + position);


    }
}

