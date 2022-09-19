import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user,newstr;
        ArrayList<Character> chararr = new ArrayList<Character>();
        System.out.print("enter a string : ");
        user = scan.nextLine();
        for (char i = 0; i < user.length(); i++) {
            if(user.charAt(i) != ' ')
            {
                chararr.add(user.charAt(i));
            }
            else{
                chararr.add('-');
            }
        }
        for (char character : chararr) {
            System.out.print(character);
        }
    }
}