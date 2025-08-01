package DSA;

public class LL {
    public class Node{
        int value;
        Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    public Node head;
    public Node tail;
    int size;
    public LL(){
        this.size=0;
    }
    public void insert(int value){
        Node node=new Node(value);
        node.next=head;
        if(tail==null){
            tail=head;
        }
        head=node;
        size++;
    }
    public void insertLast(int value){
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        if(tail==null){
            insert(value);
        }
        size++;
    }
    public void insertAtParticularIndex(int value,int index){
        if(index==0){
            insert(value);
            return;
        }
        if(index==size-1){
            insertLast(value);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next=node;
        size++;
    }
    public Node getIndex(int value){
        Node temp=head;
        for(int i=0;i<size;i++){
            temp=temp.next;
        }
        return temp;
    }
    public  int deleteFirst(){
        int value=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        int value=tail.value;
        Node secondLast=getIndex(size-2);
        tail=secondLast;
        tail.next=null;
        size--;
        return value;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
    }
}