public class LinkedList
{
    Node head = null;
    void add(int a, String b)
    {
        Node newNode = new Node(a, b);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }
    void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print("ID is : "+temp.data+" , name is : "+temp.name+"\n");
            temp = temp.next;
        }
    }
    void insert(int adr,int val,String name)
    {
        Node temp = head;
        Node newNode = new Node(val, name);
        if(adr == 1)
        {
            add(val, name);
            return;
        }
        for(int a=1;a<adr-1;a++)
        {
            temp = temp.next;
        }
        if(temp == null)
        {
            System.out.println("error");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void delete(int adr)
    {
        Node temp = head;
        Node priv = null;
        if(adr == 1)
        {
            head = head.next;
            return;
        }
        for(int a=1;a<adr;a++)
        {
            if(temp == null)
            {
                System.out.println("error");
                return;
            }
            priv = temp;
            temp = temp.next;
        }
        priv.next = temp.next;
    }
    void reverse()
    {
        Node priv = null;Node current = head;Node next = null;
        while(current != null)
        {
            next = current.next;
            current.next = priv;
            priv = current;
            current = next;
            if(current==null)
            {
                head = priv;
            }
        }
    }
}