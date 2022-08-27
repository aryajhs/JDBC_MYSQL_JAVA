 public class LinkedList {
    Node head;
    Node tail;
    int size;
    public LinkedList(){
        this.size=0;
    }
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null)
        {
            tail = head;
        }
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
         }
         public Node(int value, Node next){
             this.value = value;
             this.next= next;
         }
    }
    }

  
