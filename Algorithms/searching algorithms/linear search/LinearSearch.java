public class LinearSearch {
    public static int[] find(int[][] arr,int target){
        int[] a = {-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    a[0]=i;a[1]=j;
                    return a;
                }
            }
        }
        return a;
    }
    public static int find(int arr[],int target){
        for(int a=0;a<arr.length;a++){
            if(target == arr[a]){
                return a;
            }
        }
        return -1;
    }
    public static int find(String val,char target){
        for(int a=0; a<val.length(); a++)
        {
            if(val.charAt(a) == target){
                return a;
            }
        }
        return -1;
    }
}