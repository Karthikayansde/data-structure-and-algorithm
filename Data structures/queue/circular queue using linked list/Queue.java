public class Queue {
    Node front = null,rear = null;
    void endQueue(String val)
    {
        Node newNode = new Node(val);
        if(front == null)
        {
            newNode.next = newNode;
            front = newNode;rear = newNode;
            return;
        }
        rear.next = newNode;
        newNode.next = front;
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
        if(front == front.next)
        {
            front =null;
            rear = null;
            return;
        }
        front = front.next;
    }
    void display()
    {
        Node temp = front;
        if(temp == null)
        {
            System.out.println("its empty");
            return;
        }
        for(int a = 0;a<10;a++)
        {
            System.out.println(temp.name);
            temp = temp.next;
        }
    }
}
