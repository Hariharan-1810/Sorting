public class quick
{
    public static void quicksort(int[] a, int n)
    {
        for (int i = 0; i < n - 1 ; i++)
        {
            for (int j = 1; j < n - i ; j++)
            {
                if (a[j - 1] > a[j])
                {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int a[] = {6, 5, 4, 3, 2, 1, 0};
        quicksort(a, a.length);
    }
}