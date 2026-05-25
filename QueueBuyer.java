class QueueBuyer {
    NodeBuyer head, tail;
    int count = 0;

    void addQueue(String name, String phoneNumber){
        Buyer b = new Buyer(name, phoneNumber);
        NodeBuyer newNode = new NodeBuyer(++count, b);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Queue has been successfully added with number: " + newNode.queueNumber);
    }

    void printQueue(){
        NodeBuyer temp = head;
        System.out.println("===== QUEUE LIST =====");
        while (temp != null) {
            System.out.println("Queue Number : " + temp.queueNumber);
            System.out.println("Buyer Name   : " + temp.data.name);
            System.out.println("Phone Number : " + temp.data.phoneNumber);
            System.out.println("------------------------------------");
            temp = temp.next;
        }
        System.out.println("Total Queue: " + count);
    }

    NodeBuyer removeQueue(){
     if (head == null) return null;
        NodeBuyer served = head;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;
        count--;
        return served;
    }
}
