public class Algorithms
{
    public void sort(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i - 1; j >= 0; j--)
            {
                if (a[j + 1] < a[j])
                {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
                else
                {
                    break;
                }
            }
        }
    }

    int fun1()
    {
        return 1;
    }

    int fun3()
    {
        return 3;
    }
}
