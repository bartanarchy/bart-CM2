class NodeOrder {
    Order data;
    NodeOrder next;
    NodeOrder prev;

    NodeOrder(Order data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}