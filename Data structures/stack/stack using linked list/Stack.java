public class Stack
{
    Node top = null;
    void push(String val)
    {
        Node newNode = new Node(val);
        if(top == null)
        {
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
    }
    void pop()
    {
        if(top == null)
        {
            System.out.println("its empty");
        }
        else{
            System.out.println(top.name);
            top = top.next;
        }
    }
}