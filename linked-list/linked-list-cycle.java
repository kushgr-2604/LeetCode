public class Solution {
    public boolean hasCycle(ListNode head) {
    //     ListNode slow = head;
    //     ListNode fast = head;
    //     while (fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;

    //         if (slow == fast) {
    //             return true;
    //         }
    //     }
    //     return false;

    if (head == null) {
        return false;
    }

    ListNode tail = head;

    while (tail != null && tail.next != null) {

        head = head.next;          // 1 step
        tail = tail.next.next;     // 2 steps

        if (head == tail) {
            return true;
        }
    }

    return false;
    }
}