package Program;

public class SequentialSearch<T>
{
    public <T extends Comparable<T>> void search(T[] searchArr, T search)
    {
        for (int i = 0; i < searchArr.length; i++)
        {
            if (searchArr[i] == search)
                System.out.println(searchArr[i]);
        }

    }
}
