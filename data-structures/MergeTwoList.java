public class MergeTwoList {

    // Define Node inside your class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node mergeTwoLists(Node list1, Node list2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        tail.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    // Test it
    public static void main(String[] args) {
        MergeTwoList sol = new MergeTwoList();

        // Build list1: 1 -> 3 -> 5
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        // Build list2: 2 -> 4 -> 6
        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        // Merge
        Node result = sol.mergeTwoLists(list1, list2);

        // Print result
        while (result != null) {
            System.out.print(result.data);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }
        // Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6
    }
}