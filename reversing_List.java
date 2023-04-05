public class reversing_List {

    public static class Node{

        char data;
        Node next;

        public Node(char value){
            this.data = value;
            this.next = null;
        }
    }

    public static void reverse(Node n){

        Node curr  = n;
        Node prev = null;
        Node temp = null;
        while(curr!=null){
            temp = curr.next;
            curr.next=prev;
            prev = curr;
            curr= temp;
        }
        display(prev);

    }



    public static void display(Node n){
        Node curr = n;
        while(curr!=null){

            System.out.print("->"+ curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        Node n1 = new Node('a');
        Node n2 = new Node('b');
        Node n3 = new Node('z');

        n1.next = n2;
        n2.next=n3;

        display(n1);
        System.out.println("");
        reverse(n1);
        System.out.println(" ");


    }
}
