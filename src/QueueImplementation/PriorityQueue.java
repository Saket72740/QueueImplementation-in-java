package QueueImplementation;

public class PriorityQueue<E> {
    Node<E> front = null;
    int Size = 0;
    class Node<E>{
        E data;
        int prior;
        Node next;
        Node(E data,int prior){
            this.data = data;
            this.prior = prior;
            this.next = null;
        }
    }
    boolean isEmpty(){
        if(front == null)
            return true;
        else
            return false;
    }
    void Insert(E data,int prior){
        Node<E> newNode = new Node<>(data,prior);
        if(isEmpty() || (newNode.prior <= front.prior)){
            newNode.next = front;
            front = newNode;
            Size++;
            return ;
        }
        else{
            Node<E> temp = front;
            while(temp.next != null){
                if(temp.next.prior >= newNode.prior){
                    newNode.next = temp.next;
                    temp.next = newNode;
                    Size++;
                    return ;
                }
                temp = temp.next;
            }
            if(temp.next == null)
                temp.next = newNode;
            Size++;
        }
    }
    E Delete(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        Node<E> temp = front;
        front = front.next;
        Size--;
        return temp.data;
    }
    E GetFront(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return front.data;
    }
    void Display(){
        Node<E> temp = front;
        while(temp.next != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    void Erase(){
    }
}
