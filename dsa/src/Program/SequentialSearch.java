package Program;

public class SequentialSearch<T> {
    public <T extends Comparable<T>> void search(T[] data, T search) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == search)
                System.out.println(data[i]);        //if found print
        }

    }
}
