public class Queue {
    static final int SIZE = 5;
    int arr[] = new int[SIZE];
    int front = 0,rear = -1;
    void endQueue(int val)
    {
        rear++;
        if(rear == SIZE)
        {
            System.out.println("its full");
            rear--;
            return;
        }
        arr[rear] = val;
    }
    void deQueue()
    {
        if(rear == -1)
        {
            System.out.println("its empty");
            return;
        }
        System.out.println(arr[front]);
        for(int i = 0;i<SIZE;i++)
        {
            if(i == SIZE-1)
            {
                arr[i] = 0;
                break;
            }
            arr[i] = arr[i+1];
        }
        rear--;
    }
}
