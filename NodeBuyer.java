class NodeBuyer {
    int queueNumber;
    Buyer data;
    NodeBuyer next;
    NodeBuyer prev;


    NodeBuyer(int queueNumber, Buyer data) {
        this.queueNumber = queueNumber;
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
