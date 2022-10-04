public class InsertionSort
{
    public static int[] insertionSort(int ar[],char enter_n_toMin_x_toMax){
        for(int i = 1;i<ar.length;i++)
        {
            for(int j = i;j>0;j--)
            {
                boolean swap = false;
                if(enter_n_toMin_x_toMax == 'n')
                {
                    if(ar[j]<ar[j-1])
                    {
                        swap = true;
                        int temp = ar[j];
                        ar[j] = ar[j-1];
                        ar[j-1] = temp;
                    }
                }
                else
                {
                    if(ar[j]>ar[j-1])
                    {
                        swap = true;
                        int temp = ar[j];
                        ar[j] = ar[j-1];
                        ar[j-1] = temp;
                    }
                }
                if(!swap)
                {
                    break;
                }
            }
        }
        return ar;
    }
}