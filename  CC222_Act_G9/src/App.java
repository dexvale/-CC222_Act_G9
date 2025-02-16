import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        SinglyLinkedList sl = new SinglyLinkedList();
        while (true) {

            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            System.out.println("Operations:");
            System.out.println("[1.] Insert " + num + " into array");
            System.out.println("[2.] Insert " + num + " into Linked List");
            System.out.println("Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                array.add(num);
                System.out.println("Array after insertion: " + array);

            } else if (choice == 2) {
                System.out.println("Options:");
                System.out.println("[1.] Insert at beginning");
                System.out.println("[2.] Insert at end");
                System.out.println("Option:");
                int options = sc.nextInt();
                if (options == 1) {

                    sl.insertIntoBeginning(num);
                    System.out.printf("Array after insertion: ");
                    sl.printList();
                } else if (options == 2) {
                    sl.insertAtEnd(num);
                    System.out.printf("Array after insertion: ");
                    sl.printList();
                } else {
                    System.out.println("Invalid choices");
                    continue;
                }
                

            }
            System.out.println("Options:");
                System.out.println("[1] Enter new number");
                System.out.println("[2] End");
                int o = sc.nextInt();

                if (o == 2) {
                    System.out.println("Program ended.");
                    break;
                }

        }

    }
}
