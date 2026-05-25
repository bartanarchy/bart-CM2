class OrderList {
     NodeOrder head, tail;
    
      void addOrder(Order o) {
        NodeOrder newNode = new NodeOrder(o);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Order has been successfully added.");
    }

     void sortOrdersByName() {
        if (head == null) return;
        for (NodeOrder i = head; i != null; i = i.next) {
            for (NodeOrder j = i.next; j != null; j = j.next) {
                if (i.data.orderName.compareToIgnoreCase(j.data.orderName) > 0) {
                    Order temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }

    void printReport() {
        sortOrdersByName();
        System.out.println("=========================");
        System.out.println("ORDER REPORT (SORTED BY ORDER NAME)");
        System.out.println("=========================");
        int total = 0;
        NodeOrder temp = head;
        while (temp != null) {
            System.out.println("Order Code   : " + temp.data.orderCode);
            System.out.println("Order Name   : " + temp.data.orderName);
            System.out.println("Price        : " + temp.data.price);
            System.out.println("------------------------------------");
            total += temp.data.price;
            temp = temp.next;
        }
        System.out.println("Total Revenue : Rp " + total);
    }
}
