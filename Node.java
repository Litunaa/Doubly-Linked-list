public class Node<T> {
    private T data;
    private Node next;
    private Node prev;


    public Node(T data, Node prev, Node next){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }


    public T val(){
        return this.data;
    }

    public Node next(){
        return this.next;
    }

    public Node prev(){
        return this.prev;
    }

    public void setVal(T data){
        this.data = data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public void setPrev(Node prev){
        this.prev = prev;
    }


}   

