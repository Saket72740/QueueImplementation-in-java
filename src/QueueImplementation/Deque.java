package QueueImplementation;
public class Deque<E>{
    Node<E> front = null;
    Node<E> rear = null;
    int Size = 0;
    class Node<E>{
        E data;
        Node<E> next;
        Node<E> prev;
        Node(E data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    int size() {
        return Size;
    }
    boolean isEmpty(){
        if(front == null)
            return true;
        else
            return false;
    }
    void InsertFront(E data){
        Node<E> newNode = new Node<>(data);
        if(front == null){
            front = newNode;
            rear = newNode;
            Size++;
            return ;
        }
        Node<E> temp = front;
        while(temp.next != null){
            temp = temp.next;
        }
        newNode.prev = temp;
        temp.next = newNode;
        front = newNode;
        Size++;
    }
    void InsertRear(E data){
        Node<E> newNode = new Node<>(data);
        if(front == null){
            front = newNode;
            rear = newNode;
            Size++;
            return ;
        }
        newNode.next = rear;
        rear.prev = newNode;
        rear = newNode;
        Size++;
    }
    E DeleteFront(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        Node<E> temp = front;
        front = front.prev;
        if(front == null)
            rear = null;
        else
            front.next = null;
        Size--;
        return temp.data;
    }
    E DeleteRear(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        Node<E> temp = rear;
        rear = rear.next;
        if(rear == null)
            front = null;
        else
            rear.prev = null;
        Size--;
        return temp.data;
    }
    E getFront() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return front.data;
    }
    E getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return rear.data;
    }
    void Display(){
        Node<E> temp = rear;
        while(temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    void Erase() {
        rear = null;
        while(front != null) {
            Node temp = front;
            front = front.prev;
        }
        front = null;
        Size = 0;
    }
}