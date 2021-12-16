package CollectionFramework;

public class LinkedList {
    public static void main(String[] args) {

        java.util.LinkedList<Integer> al = new java.util.LinkedList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.remove(3);

        for (Integer number : al) {
            System.out.println(number);
        }
    }
}
