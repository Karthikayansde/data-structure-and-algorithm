public class Temp {
    public static void main(String[] args) {
        CircularLinkedList lis = new CircularLinkedList();
        lis.add("kaya");
        lis.add("karthi");
        lis.add("kayan");
        lis.add("raj");
        lis.display();
        System.out.println();
        lis.deleteEnd();
        lis.display();
    }
}