public class Day81_ReverseNodesinkGroup {

     public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head; 
        
        // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroup = dummy;
        
        while (true) {
            // Check if there are at least k nodes to reverse
            ListNode kthNode = getKthNode(prevGroup, k);
            if (kthNode == null) break; 
            
            ListNode nextGroup = kthNode.next; // Node where the next group starts
            // Reverse the current group
            ListNode prev = nextGroup, curr = prevGroup.next;
            while (curr != nextGroup) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            
            // Adjust connections
            ListNode temp = prevGroup.next;
            prevGroup.next = kthNode;
            prevGroup = temp;
        }
        
        return dummy.next;
    }
    
    // Helper function to find the k-th node from the starting node
    private ListNode getKthNode(ListNode start, int k) {
        while (start != null && k > 0) {
            start = start.next;
            k--;
        }
        return start;
    }

    public static void main(String[] args) {
        // Your code here
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);

        Day81_ReverseNodesinkGroup solution = new Day81_ReverseNodesinkGroup();
        ListNode reversed = solution.reverseKGroup(head, 3);

        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }

    }
}
