public class doublelinked<T>{
    private Node<T> head;
    private int length;
    private Node<T> tail;



    public doublelinked(){
        this.head = null;
        this.length = 0;
        this.tail = null;
    }

    public int length(){
        return this.length;
    }

    public T getFirst(){
        return head.val();
    }

    public T getLast(){
        return tail.val();
    }


    public void append(T data){
        Node<T> newNode = new Node<T>(data, this.head, null);

        if (this.tail == null){
            this.head = newNode;
            this.tail = newNode;
        }

        else{
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        length++;

    }


    public String toString(){
        Node<T> current  = this.head;

        StringBuilder string = new StringBuilder();

        while (current != null){
            string.append(String.valueOf(current.val()) + " -> ");
        }
        string.append("null");

        return string.toString();
    }




    public static void main(String[] args){
        doublelinked<Integer> list = new doublelinked<Integer>();

        list.append(1);
        list.append(5);


        System.out.println(list.toString());
    }
}