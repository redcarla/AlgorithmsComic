package Program;

public class InsertionSortAlgo {

    public <T extends Comparable<T>> void insSort(T[] data) {
        int n = data.length;

        for (int a = 0; a < n; a++)                                 //from start to finish
        {
            for (int b = a; b > 0; b--)                             //from right to left
            {
                if (data[b-1].compareTo(data[b]) > 0)               //check if b-1 is bigger than b
                {
                    swap(data, b-1, b);                          //swap if b-1 is greater
                }
            }
        }
    }

    private <T extends Comparable<T>> void swap(T[] data, int a, int b) //simple swap
    {
        T swap = data[a];
        data[a] = data[b];
        data[b] = swap;
    }

}
