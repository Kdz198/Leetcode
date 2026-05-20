package Medium;

import Lib.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int temp = 0;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null || l2 != null) {

            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;

            int sum = v1 + v2 + temp;

            temp = 0;

            if (sum >= 10) {
                sum = sum - 10;
                temp = 1;
            }
            //   System.out.println(current.val);

            current.next = new ListNode(sum);
            current = current.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;


        }

        if (temp == 1)
            current.next = new ListNode(1);

        return dummy.next;
    }


}
