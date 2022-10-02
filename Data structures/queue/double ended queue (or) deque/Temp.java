public class Temp {
    public static void main(String[] args) {
        Deque dq = new Deque(5);
        dq.addfront(22);
        dq.addrear(55);
        dq.deletefront();
        System.out.println(dq.getFront());
    }
}