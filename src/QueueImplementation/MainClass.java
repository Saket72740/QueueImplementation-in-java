package QueueImplementation;
import java.util.Scanner;
public class MainClass{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<String> obj = new PriorityQueue<>();
        System.out.println(obj.isEmpty());
        for(int i=0;i<n;i++){
            obj.Insert(sc.next(), sc.nextInt());
        }
        System.out.println("Item at the rear end is : " + obj.GetFront());
        System.out.println("Size of Queue : " + obj.Size);
        System.out.print("Elements in Queue are : ");
        obj.Display();
        System.out.println("Popped Item is : " + obj.Delete());
        System.out.println("Size of Queue : " + obj.Size);
        System.out.println("Popped Item is : " + obj.Delete());
        System.out.println("Size of Queue : " + obj.Size);
        System.out.print("Elements in Queue are : ");
        obj.Display();
    }
}
    