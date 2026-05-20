package Easy;

import Lib.ListNode;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode result = new ListNode(0);
        ListNode current = result;

        while (list1 != null || list2 != null) {

            if (list1 == null) {
                current.next = list2;
                break;
            }

            if (list2 == null) {
                current.next = list1;
                break;
            }

            if (list1.val < list2.val) {
                current.next = new ListNode(list1.val);
                current = current.next;

                list1 = list1.next;
            } else {
                current.next = new ListNode(list2.val);
                current = current.next;

                list2 = list2.next;
            }

        }

        return result.next;
    }
}
