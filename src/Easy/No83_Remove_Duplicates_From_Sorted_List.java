package Easy;

import Util.ListNode;

public class No83_Remove_Duplicates_From_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val)
                current.next = current.next.next;
            else
                current = current.next;
        }
        return head;
    }
}
