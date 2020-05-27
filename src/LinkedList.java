public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }

    public void add(int value){
        Node a = new Node(value, null);
        if(this.head==null&&this.tail==null) {
            this.head = a;
            this.tail = a;
            length++;
        }
        else{
            this.tail.setNext(a);
            this.tail=a;
            length++;
        }
    }

    public int get(int index){
        if (index>length-1){
            throw new IndexOutOfBoundsException("This is out of bounds");
        }
        else{
            Node a = this.head;
            for (int i = 0; i < index; i++) {
                a=a.getNext();
            }
            return a.getValue();
        }
    }

    public void insert(int value, int index) {
        if (index == 0) {
            Node a = new Node(value, this.head);
            this.head=a;
            length++;
        }
        else {
            Node a = this.head;
            for (int i = 0; i < index - 1; i++) {
                a = a.getNext();
            }
            Node b = new Node(value, a.getNext());
            a.setNext(b);
            length ++;
        }
    }
    public void remove(int index){
        if (index>length-1){
            throw new IndexOutOfBoundsException("This is out of bounds");
        }
        else if (index==0){
            this.head=this.head.getNext();
            length--;
        }
        else{
            Node a = this.head;
            for (int i = 0; i < index-1; i++) {
                a=a.getNext();
            }
            a.setNext(a.getNext().getNext());
            length--;
        }
    }

    public int pop(){
        if (this.head==null){
            throw new IndexOutOfBoundsException("This is out of bounds");
        }
        else {
            int a = this.head.getValue();
            this.head = this.head.getNext();
            length--;
            return a;
        }
    }

    public void push(int value){
        if(this.head==null){
            this.head=new Node(value, this.tail);
            length++;
        }
        else{
            Node a = new Node(value, this.head);
            this.head=a;
            length++;
        }
    }

    public void set(int value, int index){
        if(index>length){
            throw new IndexOutOfBoundsException("This is out of bounds");
        }
        else if(index==0){
            Node a = this.head.getNext();
            this.head = new Node(value, a);
        }
        else {
            Node a = this.head;
            for (int i = 0; i < index - 1; i++) {
                a = a.getNext();
            }
            Node b = a.getNext().getNext();

            a.setNext(new Node(value, b));
        }
    }

    public int size(){
        return this.length;
    }

    public int pushget(int value){
        if(this.head==null){
            this.head=new Node(value, this.tail);
            length++;
        }
        else{
            Node a = new Node(value, this.head);
            this.head=a;
            length++;
        }
        return this.head.getValue();
    }

    public int removeget(int index){
        if (index>length-1){
            throw new IndexOutOfBoundsException("This is out of bounds");
        }
        else if (index==0){
            int v = this.head.getValue();
            this.head=this.head.getNext();
            length--;
            return v;
        }
        else{
            Node a = this.head;
            for (int i = 0; i < index-1; i++) {
                a=a.getNext();
            }
            int v = a.getNext().getValue();
            a.setNext(a.getNext().getNext());
            length--;
            return v;
        }
    }
}
