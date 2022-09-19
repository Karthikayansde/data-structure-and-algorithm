import java.util.Scanner;

public class Main
{
    static boolean exist = true;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        A a1 = new A();
        while(exist == true)
        {
            int chooice = 0;
            System.out.print("1. insert a element\n2. display a elements\n3. insert at place\n4. delete at place\n5. exit\nenter a option : ");
            chooice = scan.nextInt();
            switch (chooice) {
                case 1:
                {
                    System.out.print("enter a value to insert : ");
                    int a;
                    a = scan.nextInt();
                    a1.add(a);
                    break;
                }
                case 2:
                {
                    a1.display();
                    break;
                }
                case 3:
                {
                    int a = 0,pl = 0;
                    System.out.print("enter a place : ");
                    pl = scan.nextInt();
                    System.out.print("enter a value : ");
                    a = scan.nextInt();
                    a1.insert(a,pl);
                    break;
                }
                case 4:
                {
                    int pl = 0;
                    System.out.print("enter a place : ");
                    pl = scan.nextInt();
                    a1.delete(pl);
                    break;
                }
                case 5:
                {
                    exist = false;
                    break;
                }
            }
        }
    }
}