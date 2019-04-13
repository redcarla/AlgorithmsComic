package Program;

public class StupidBubbleAlgo<T extends Comparable<T>> {


    public void stupidSort(T[] data) {
        int n = data.length;
        T temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (data[j - 1].compareTo(data[j]) > 0) {
                    //swap elements
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }

            }
        }

    }
}


