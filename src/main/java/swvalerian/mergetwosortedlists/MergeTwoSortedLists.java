package swvalerian.mergetwosortedlists;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 * <p>
 * Example 3:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * <p>
 * Example 2:
 * Input: list1 = [], list2 = []
 * Output: []
 * <p>
 * Example 3:
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 */
public class MergeTwoSortedLists {

    public static class ListNode {
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
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode mergedList = head;

        while (list1 != null && list2 != null) {

                if (list1.val < list2.val) {
                mergedList.next = list1; // здесь записано текущее значение лист1 и всей его последовательности
                list1 = list1.next; // здесь лист1 стал другим, но в мерджедлист.некст хранится старое значение лист1 - что нам и надо для цепочки.
            } else {
                mergedList.next = list2;
                list2 = list2.next;
            }

            mergedList = mergedList.next; // здесь нам надо переключиться на след. звено в цепочке, дабы записать в его поле некст - новое сравнимое значение
        }

        mergedList.next = list1 == null ? list2 : list1;

        return head.next;
    }
}
