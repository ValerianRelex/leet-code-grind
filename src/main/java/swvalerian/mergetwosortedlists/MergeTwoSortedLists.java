package swvalerian.mergetwosortedlists;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 *
 * Example 3:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 *
 * Example 2:
 * Input: list1 = [], list2 = []
 * Output: []
 *
 * Example 3:
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 */
public class MergeTwoSortedLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null) {
                return list2;
            } else if (list2 == null) {
                return list1;
            }

            // на данном этапе мы четко знаем, что оба наших списка не пустые.
            // теперь нам надо инициализировать mergedList, чтобы сохранить на него ссылку в head

            ListNode mergedList;

            if (list1.val < list2.val) {
                mergedList = list1;
                list1 = list1.next;
            } else {
                mergedList = list2;
                list2 = list2.next;
            }

            ListNode head = mergedList;

            while (list1 != null && list2 != null) {

                if (list1 == null) {
                    mergedList.next = new ListNode(list2.val);
                    list2 = list2.next;
                } else if (list2 == null) {
                    mergedList.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else if (list1.val < list2.val) {
                    mergedList.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    mergedList = new ListNode(list2.val);
                    list2 = list2.next;
                }
            }

            return head;
        }
    }
}
