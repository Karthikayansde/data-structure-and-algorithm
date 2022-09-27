public class Stack
{
    static final int SIZE = 5;
    int arr[] = new int[SIZE];
    int top = -1;
    void push(int val)
    {
        top++;
        if(top == 5)
        {
            top --;
            System.out.println("its full!");
            return;
        }
        arr[top] = val;
    }
    void pop()
    {
        if(top == -1)
        {
            System.out.println("its empty");
            return;
        }
        System.out.println(arr[top]);
        top--;
    }
}