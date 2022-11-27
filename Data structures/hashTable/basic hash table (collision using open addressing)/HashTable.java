public class HashTable {
   int a[] = new int[10],max = 10;
   void put(int val){
      int index = val%max;
      if(a[index] > 0){
         for (int i = 1; i < a.length; i++) {
            index = (val+i)%max;
            if(a[index] > 0){
               continue;
            }
            a[index] = val;
            return;
         }
      }
      a[index] = val;
   }
   int get(int val){
      int index = val%max,ans = -1;
      if(val != 0 && a[index] == 0){
         System.out.println("there is no value like "+val);
         return -1;
      }
      if(a[index] != val){
         for (int i = 1; i < a.length; i++) {
            index = (val+i)%max;
            if(a[index] != val){
               continue;
            }
            ans = a[index];
            a[index] =0;
            return ans;
         }
      }
      ans = a[index];
      a[index] = 0;
      return ans;
   }
   void traverse(){
      int  count = 0;
      for (int i : a) {
         if(i != 0){
            count++;
            System.out.println(i);
         }
      }
      if(count == 0){
         System.out.println("there is nothing.");
      }
   }
}