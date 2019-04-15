package Program;

public class SmartBubbleAlgo<T extends Comparable<T>> {

    public void smartBubble(T[] data) {                 //same as stupid just uses boolean as well
        int n = data.length - 1;
        T temp;

        for (int i = 1; i < data.length; i++) {
            boolean sorted = true;
            int currentSwap = -1;
            for (int j = 0; j < n; j++) {
                if (data[j].compareTo(data[j + 1]) > 0) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    sorted = false;
                    currentSwap = j;
                }
            }
            if (sorted) {
                return;
            }
            n = currentSwap;
        }
    }
}

