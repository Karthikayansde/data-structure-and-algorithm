public class Temp {
    public static void main(String[] args) {
        int[] a={3,7,4,9,2,0,1,5,8,6};String name = "karthi";
        int[][] ar = {{9,8,7},{6,5,4},{3,2,1}};
        LinearSearch ls = new LinearSearch();
        int[] arr = ls.find(ar, 2);
        System.out.println(arr[0]+" "+arr[1]);
    }
}