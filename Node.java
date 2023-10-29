public class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> prev;


    public Node(T data, Node<T> prev, Node<T> next){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }


    public T val(){
        return this.data;
    }

    public Node<T> next(){
        return this.next;
    }

    public Node<T> prev(){
        return this.prev;
    }

    public void setVal(T data){
        this.data = data;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }

    public void setPrev(Node<T> prev){
        this.prev = prev;
    }


}   

