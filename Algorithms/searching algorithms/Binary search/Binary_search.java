public class Binary_search {
    public static int find(int arr[], int target){
        int start = 0,end = arr.length-1,mid;
            while(start<=end){
                mid = (start+end)/2;
                if(arr[mid] == target){
                    return mid;
                }
                if(arr[start] < arr[end]){
                    if(target > arr[mid]){
                        start = mid+1;
                    }
                    else if(target < arr[mid]){
                        end = mid-1;
                    }
                }
                else{
                    if(target > arr[mid]){
                        end = mid-1;
                    }
                    else if(target < arr[mid]){
                        start = mid+1;
                    }
                }
            }
        return -1;
    }
}