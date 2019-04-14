package Program;

public class QuickSortAlgo {

    public <T extends Comparable<T>> void quickSort(T[] a) {
        quickSort2(a, 0, a.length - 1);
    }

    public <T extends Comparable<T>> void quickSort2(T[] a, int lo, int hi) {
        if (lo >= hi) return;
        int pi = divide(a, lo, hi);
        quickSort2(a, lo, pi - 1);
        quickSort2(a, pi + 1, hi);
    }

    public <T extends Comparable<T>> int divide(T[] a, int lo, int hi) {
        int i = lo + 1;
        int j = hi;

        while (i <= j) {
            if (a[i].compareTo(a[lo]) <= 0) {
                i++;
            } else if (a[j].compareTo(a[lo]) > 0) {
                j--;
            } else
                swap(a, i, j);
        }
        swap(a, lo, j);
        return j;
    }

    public void swap(Object[] a, int i, int j) {
        Object tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
