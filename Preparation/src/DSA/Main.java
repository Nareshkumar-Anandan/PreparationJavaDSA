package DSA;

public class Main {
    public static void main(String[] args) {
        LL linkedlist=new LL();

        linkedlist.insert(3);
        linkedlist.insert(5);
        linkedlist.insert(7);
        linkedlist.insert(9);
        linkedlist.insertLast(2);
        linkedlist.insertAtParticularIndex(4,0);
        linkedlist.display();
        linkedlist.deleteLast();
        linkedlist.display();
    }
}
