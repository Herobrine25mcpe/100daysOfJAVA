import java.sql.SQLOutput;

public class add_two_list {

    static Node Head;

    public static class Node{

        int data;
        Node next;

        public Node(int val){
            this.data = val;
            this.next = null;
        }
    }

    static void add(Node n,Node m){
        Node x = n;
        Node y = m;
        while( x!=null && y!=null){
            System.out.print(" ->");
            System.out.print( x.data + y.data);
            x=x.next;
            y=y.next;
        }

    }


    static void display(Node n){
        Node curr = n;
        while(curr!=null){
            System.out.print(" -> " + curr.data);
            curr=curr.next;
        }
    }


    public static void main(String[] args) {
        Node n1= new Node(1);
        Node n2= new Node(2);
        Node n3= new Node(3);

        n1.next = n2;
        n2.next=n3;

        Node m1= new Node(4);
        Node m2= new Node(5);
        Node m3= new Node(6);

        m1.next = m2;
        m2.next= m3;

        display(n1);
        System.out.println();
        display(m1);
        System.out.println();

        add(n1,m1);



    }
}
