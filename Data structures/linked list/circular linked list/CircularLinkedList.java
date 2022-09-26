public class CircularLinkedList
{
    Node last = null;
    void add(String strVal)
    {
        Node newNode = new Node(strVal);
        if(last==null)
        {
            newNode.next = newNode;
            last = newNode;
        }
        else
        {
            newNode.next = last.next;
            last.next = newNode;
        }
    }
    void addEnd(String strVal)
    {
        Node newNode = new Node(strVal);
        if(last == null)
        {
            newNode.next = newNode;
            last = newNode;
        }
        else
        {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }
    void display()
    {
        if(last == null)
        {
            System.out.println("its empty");
            return;
        }
        Node temp = last.next;
        do{
            System.out.println(temp.name);
            temp = temp.next;
        }while(temp != last.next);
    }
    void deleteBegi()
    {
        if(last == null)
        {
            System.out.println("its empty");
            return;
        }
        if(last == last.next)
        {
            last = null;
            return;
        }
        last.next = last.next.next;
    }
    void deleteEnd()
    {
        if(last == null)
        {
            System.out.println("its empty");
            return;
        }
        if(last == last.next)
        {
            last = null;
            return;
        }
        else{
            Node temp = last.next;
            do{
                temp = temp.next;
            }while(temp.next != last);
            temp.next = last.next;
            last = temp;
        }
    }
}