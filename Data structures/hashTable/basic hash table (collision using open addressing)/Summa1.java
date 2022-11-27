public class Summa1
{
    public static void main(String[] args) {
        HashTable hash = new HashTable();
        hash.put(23);
        hash.put(13);
        hash.put(33);
        hash.traverse();
        System.out.println();
        hash.get(23);
        hash.traverse();
    }
}