public class mergesort
{
    public static int[] merge(int[] x, int[] y)
    {
        int n = x.length;
        int m = y.length;

        int i = 0, j = 0, k = 0;
        int result[] = new int[n + m];

        while(i < n && j < m)
        {
            if(x[i] < y[j])
            {
                result[k] = x[i];
                k++;
                i++;
            }
            else
            {
                result[k] = y[j];
                k++;
                j++;
            }
        }
        if(i == n)
        {
            while(j < m)
            {
                result[k] = y[j];
                k++;
                j++;
            }
        }
        if(j == m)
        {
            while(i < n)
            {
                result[k] = x[i];
                k++;
                i++;
            }
        }
        return result;
    }
    public static int[] divide(int a[], int l, int r)
    {
        if(l >= r)
        {
            int temp[] = {a[l]};
            return temp;
        }

        int mid = (l + r) / 2;
        int x[] = divide(a, l, mid);
        int y[] = divide(a, mid+1, r);

        return merge(x, y);

    }

    public static void main(String[] args)
    {
        int a[] = {20, 10, 30, 50, 60, 5, 80, 25};

        int l = 0;
        int r = a.length - 1;

        int ans[] = divide(a, l, r);

        for(int i = 0; i < ans.length; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}
