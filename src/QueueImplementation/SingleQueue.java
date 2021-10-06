package QueueImplementation;
public class SingleQueue<E> {
    Node<E> front = null;
    Node<E> rear = null;
    class Node<E>{
        E data;
        Node<E> next;
        Node(E d){
            this.data = d;
            this.next = null;
        }
    }
    boolean isEmpty(){
        if(rear == null)
            return true;
        else
            return false;
    }
    void Insert(E d){
        Node<E> newNode = new Node<E>(d);
        if(front == null){
            front = newNode;
            rear = newNode;
            return ;
        }
        newNode.next = front;
        front = newNode;
    }
    E Delete(){
        Node<E> temp = front,temp1 = rear;
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        if(temp.next == null){
            temp1 = temp;
            rear = temp;
            rear = null;
            return temp1.data;
        }
        while(temp.next.next != null){
            temp = temp.next;
        }
        rear = temp;
        rear.next = null;
        return temp1.data;
    }
    void Display(){
        Node<E> temp = front;
        while(temp.next != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}