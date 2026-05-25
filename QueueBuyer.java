class QueueBuyer {
    NodeBuyer head, tail;
    int count = 0;

    void addQueue(String name, String phoneNumber){
        Buyer b = new Buyer(name, phoneNumber); // create a new buyer and give ++ticket number
        NodeBuyer newNode = new NodeBuyer(++count, b);
        if (head == null) { // if only one node then head and tail will point to the same node
            head = tail = newNode;
        } else {
            tail.next = newNode; // if theres some new node then the next of tail will point to new node
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Queue has been successfully added with number: " + newNode.queueNumber);
    }

    void printQueue(){
        NodeBuyer temp = head;
        System.out.println("===== QUEUE LIST =====");
        while (temp != null) { // while temp is not null, then temp will point to the next node until temp is null
            System.out.println("Queue Number : " + temp.queueNumber);
            System.out.println("Buyer Name   : " + temp.data.name);
            System.out.println("Phone Number : " + temp.data.phoneNumber);
            System.out.println("------------------------------------");
            temp = temp.next;
        }
        System.out.println("Total Queue: " + count);
    }

    NodeBuyer removeQueue(){
     if (head == null) return null;// if head is null, then there is no queue to remove
        NodeBuyer served = head;
        head = head.next;
        if (head != null) head.prev = null; //if head is not null, then the previous of head will point to null. 
        else tail = null;
        count--; // 5. Decrease queue count and return the served customer data
        return served;
    }
}
