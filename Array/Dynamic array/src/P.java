import java.util.ArrayList;
import java.util.Scanner;

public class P 
{
    Scanner scan = new Scanner(System.in);
    ArrayList<D> stu = new ArrayList<D>();
    int buf = 0;
    void addstu()
    {
        String name;
        int id;
        if(buf>=1)
        {
            scan.nextLine();
        }
        buf++;
        System.out.print("enter a name : ");
        name = scan.nextLine();
        System.out.print("enter a ID : ");
        id = scan.nextInt();
        D d = new D(name, id);
        stu.add(d);
    }
    void prin()
    {
        for (D e : stu)
        {
            e.printd();
        }
    }
}