public class Queue {
    Node front = null,rear = null;
    void endQueue(String val)
    {
        Node newNode = new Node(val);
        if(front==null)
        {
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    void deQueue()
    {
        if(rear == null || front == null)
        {
            System.out.println("its empty");
            return;
        }
        System.out.println(front.name);
        front = front.next;
    }
}
