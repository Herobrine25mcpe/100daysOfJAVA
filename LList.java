public class LList {

    static Node Head;

    public static class Node{

        int data;
        Node next;

        Node(int val){
            this.data = val;
            next = null;
        }
    }

    static void Insertathead(int val){

        Node n = new Node(val);

        n.next = Head;
        Head = n;
    }

    static void InsertAfter(int val, int index){

        Node n = new Node(val);
        Node temp = Head;
        int count=0;

        while(count<index){
            temp = temp.next;
            count++;
        }

        n.next = temp.next;
        temp.next = n;
    }

    static void DeleteAfter( int index){

        Node temp = Head;
        int count=0;
        while(count<index) {
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;
    }

    static int Search( int val){

        Node temp = Head;
        int index = -1;
        for ( ; temp != null ;index++) {

            if(temp.data ==val){
                break;
            }
            temp= temp.next;
        }

        return index + 1;
    }





    static void display(Node head){

        Node curr = head;

        while(curr != null ){

            System.out.print(" ->" + curr.data);
            curr = curr.next;
        }

    }

    public static void main(String[] args) {

        Node n1 = new Node(30);
        Head = n1;

        Insertathead(20);
        Insertathead(10);

        InsertAfter(40,2);
        InsertAfter(50,3);

        DeleteAfter(3);


        display(Head);
        System.out.println("");
        System.out.println("the number is present at index :"+Search(30));
    }
}
