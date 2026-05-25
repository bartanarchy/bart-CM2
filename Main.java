import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueBuyer qb = new QueueBuyer();
        OrderList ol = new OrderList();
        int choice, orderCode = 0;

        do {
            System.out.println("===========================");
            System.out.println("ROYAL DELISH QUEUE SYSTEM");
            System.out.println("===========================");
            System.out.println("1. Add Queue");
            System.out.println("2. Print Queue");
            System.out.println("3. Remove Queue and Order");
            System.out.println("4. Order Report");
            System.out.println("0. Exit");
            System.out.print("Choose menu : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Buyer Name : ");
                    String name = sc.nextLine();
                    System.out.print("Phone Number : ");
                    String phone = sc.nextLine();
                    qb.addQueue(name, phone);
                    break;
                case 2:
                    qb.printQueue();
                    break;
                case 3:
                    NodeBuyer served = qb.removeQueue();
                    if (served != null) {
                        System.out.println("Served Buyer:");
                        System.out.println("Queue Number : " + served.queueNumber);
                        System.out.println("Buyer Name   : " + served.data.name);
                        System.out.println("Phone Number : " + served.data.phoneNumber);
                        System.out.print("Order Code : ");
                        orderCode++;
                        System.out.println(orderCode);
                        System.out.print("Order Name : ");
                        String orderName = sc.nextLine();
                        System.out.print("Price : ");
                        int price = sc.nextInt();
                        sc.nextLine();
                        Order o = new Order(orderCode, orderName, price);
                        ol.addOrder(o);
                    } else {
                        System.out.println("No queue available.");
                    }
                    break;
                case 4:
                    ol.printReport();
                    break;
                case 0:
                    System.out.println("Exit program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        sc.close();
    }
}
