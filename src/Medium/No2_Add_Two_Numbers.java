package Medium;

import Util.ListNode;

public class No2_Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode current = res;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry
                    + (l1 != null ? l1.val : 0)
                    + (l2 != null ? l2.val : 0);

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0)
            current.next = new ListNode(carry);

        return res.next;
    }
}
