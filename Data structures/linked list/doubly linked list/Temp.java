public class Temp {
    public static void main(String[] args) {
        doublyLinkedList lis = new doublyLinkedList();
        lis.add("kaya");
        lis.add("karthi");
        lis.add("karthick");
        lis.add("kar");
        lis.insert(1, "raj");
        lis.displayrev();
        System.out.println();
        lis.insert(6, "kayan");
        lis.displayrev();
    }
}