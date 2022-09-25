public class doublyLinkedList
{
    Node head = null, tail = null;
    void add(String name)
    {
        Node newNode = new Node(name);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
    void insert(int pos,String val)
    {
        Node newNode = new Node(val);
        if(pos  == 1)
        {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            return;
        }
        Node prev=null,next=null,temp = head;
        for(int a = 1;a<pos;a++)
        {
            prev = temp;
            next = prev.next;
            temp = temp.next;
        }
        if(next == null)
        {
            newNode.prev = prev;
            prev.next = newNode;
            tail = newNode;
            return;
        }
        next.prev = newNode;
        newNode.next = next;
        newNode.prev = prev;
        prev.next = newNode;

    }
    void displayrev()
    {
        Node temp = tail;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
    void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    void delete(int pos)
    {
        if(pos == 1)
        {
            deleteBig();
            return;
        }
        Node prev=null,next=null,temp = head;
        for(int a = 1;a<=pos;a++)
        {
            prev = temp.prev;
            next = temp.next;
            temp = temp.next;
        }
        if(next == null)
        {
            deleteEnd();
            return;
        }
        next.prev = prev;
        prev.next = next;
    }
    void deleteBig()
    {
        head = head.next;
        head.prev = null;
    }
    void deleteEnd()
    {
        tail = tail.prev;
        tail.next = null;
    }
}