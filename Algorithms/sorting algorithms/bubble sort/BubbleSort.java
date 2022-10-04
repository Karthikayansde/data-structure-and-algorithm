public class BubbleSort
{
    public static int[] selectionSort(int ar[],char enter_n_toMin_x_toMax){
        
        int len = ar.length-1;
        for (int i = 0; i < ar.length-1; i++)
        {
            boolean swap = false;
            for (int j = 0; j < len; j++)
            {
                if(enter_n_toMin_x_toMax == 'n')
                {
                    if(ar[j] > ar[j+1])
                    {
                        swap = true;
                        int temp = ar[j];
                        ar[j] = ar[j+1];
                        ar[j+1] = temp;
                    }
                }
                else
                {
                    if(ar[j] < ar[j+1])
                    {
                        swap = true;
                        int temp = ar[j];
                        ar[j] = ar[j+1];
                        ar[j+1] = temp;
                    }
                }
            }
            len--;
            if(!swap)
            {
                System.out.println("its already sorted");
                return ar;
            }
        }
        return ar;
    }
}