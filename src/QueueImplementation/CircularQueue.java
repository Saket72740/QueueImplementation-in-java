package QueueImplementation;

public class CircularQueue{
    int front = -1;
    int rear = -1;
    int Size;
    int MAX;
    int []A;
    CircularQueue(int d) {
        MAX = d;
        this.A = new int[MAX];
    }

    boolean isEmpty(){
        if(front == -1)
            return true;
        else
            return false;
    }
    boolean isFull(){
        return (rear+1)%MAX == front;
    }
    void Insert(int data){
        if(isFull())
        {
            System.out.println("Queue Overflow");
            return ;
        }
        rear = (rear+1)%MAX;
        A[rear] = data;
        if(front == -1)
            front = rear;
        Size++;
    }
    int Delete(){
        int item;
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        item = A[front];
        if(front == rear)
            front = rear= -1;
        else
            front = (front+1)%MAX;
        Size--;
        return item;
    }
    void Display(){
        int i;
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return ;
        }
        if(front<rear){
            for(i=front;i<MAX;i++){
                System.out.print(A[i] + " ");
            }
            System.out.println();
        }
        else {
            for (i = front; i < MAX; i++) {
                System.out.print(A[i] + " ");
            }
            for (i = 0; i < front; i++)
                System.out.print(A[i] + " ");
            System.out.println();
        }
    }
    int GetFront(){
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        return A[front];
    }
    int GetRear(){
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        return A[rear];
    }
}
