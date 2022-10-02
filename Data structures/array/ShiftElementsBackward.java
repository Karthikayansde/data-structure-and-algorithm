public class ShiftElementsBackward {
    public static void main(String[] args) {
        int size = 5;
        int a[] = new int[size];
        a[0] = 23;a[1]= 24; a[2] = 89; a[3] = 48; a[4] = 458;
        for(int i = 0;i<size;i++)
        {
            //set last element = 0
            if(i == size-1)
            {
                a[i] = 0;
                break;
            }
            a[i] = a[i+1];
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
