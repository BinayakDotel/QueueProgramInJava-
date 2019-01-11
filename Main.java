import pack.queue.Queue;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Queue queue = new Queue();
        boolean session = true;
        while (session) {
            System.out.println("MENU:\n1)Enqueue\n2)Dequeue\n3)Display\n4)Exit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter value to Enqueue: ");
                    int value = scan.nextInt();
                    queue.enQueue(value);
                    break;
                case 2:
                    queue.deQueue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Good Bye!!!");
                    session=false;
                    break;
                default:
                    System.out.println("Wrong choice!!!");
            }
        }
    }
}