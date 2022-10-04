public class SelectionSort
{
    public static int[] selectionSort(int ar[],char enter_n_toMin_x_toMax){
        for (int i = 0; i < ar.length-1; i++){
            int pos = i, max = ar[pos], temp = 0;
            for (int j = pos+1; j < ar.length; j++) {
                if(enter_n_toMin_x_toMax == 'x'){
                    if(ar[pos] < ar[j]){
                        pos = j;
                        max = ar[j];
                    }
                }
                else{
                    if(ar[pos] > ar[j]){
                        pos = j;
                        max = ar[j];
                    }
                }
            }
            temp = ar[i];
            ar[i] = max;
            ar[pos] = temp;
        }
        return ar;
    }
}