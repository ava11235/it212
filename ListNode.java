// ListNode stores a single node of a linked list of integers

public class ListNode {
	
	// data stored in this node
    public int data;   
   // link to next node in the list
    public ListNode next;  

    // construct a node with data 0 and null link
    public ListNode() {
        this(0, null);
    }

    // construct a node with given data and null link
    public ListNode(int data) {
        this(data, null);
    }

    // construct a node with given data and given link
    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}