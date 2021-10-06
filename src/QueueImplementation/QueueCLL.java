package QueueImplementation;

public class QueueCLL<E> {
    Node<E> rear = null;
    int Size = 0;
    class Node<E>{
        E data;
        Node<E> next;
        Node(E data){
            this.data = data;
            this.next = null;
        }
    }
    boolean isEmpty(){
        if(rear == null)
            return true;
        else
            return false;
    }
    void push(E data){
        Node<E> newNode = new Node<>(data);
        if(isEmpty()){
            rear = newNode;
            newNode.next = rear;
            Size++;
            return ;
        }
        newNode.next = rear.next;
        rear.next = newNode;
        rear = newNode;
        Size++;
    }
    E pop()
    {
        if(isEmpty()){
            System.out.println("Stack underflow");
            return null;
        }
        Node<E> temp = rear.next;
        if(rear.next == rear){
            rear = null;
            Size--;
            return temp.data;
        }
        temp = rear.next;
        rear.next = rear.next.next;
        Size--;
        return temp.data;
    }
    E DisplayRear(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        return rear.next.data;
    }
    E DisplayFront(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        return rear.data;
    }
    void Display() {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return ;
        }
        Node<E> temp = rear.next;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while(temp != rear.next);
        System.out.println();
    }
    void Erase(){
        Node<E> temp = rear.next,temp1;
        while(temp.next != rear){
            temp1 = temp.next;
            temp = null;
            temp = temp1;
        }
        rear = null;
    }
}
