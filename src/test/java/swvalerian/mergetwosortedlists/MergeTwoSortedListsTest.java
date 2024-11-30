package swvalerian.mergetwosortedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
class MergeTwoSortedListsTest {

    @Test
    void mergeTwoSortedLists_case1() {
        MergeTwoSortedLists.ListNode list1 = new MergeTwoSortedLists.ListNode(1);
        MergeTwoSortedLists.ListNode list2 = new MergeTwoSortedLists.ListNode(1);

        list1.next = new MergeTwoSortedLists.ListNode(2, new MergeTwoSortedLists.ListNode(4));
        list2.next = new MergeTwoSortedLists.ListNode(3, new MergeTwoSortedLists.ListNode(4));

        MergeTwoSortedLists.ListNode mergedList = MergeTwoSortedLists.mergeTwoLists(list1, list2);

        assertEquals(1, mergedList.val);
        assertEquals(1, mergedList.next.val);
        assertEquals(2, mergedList.next.next.val);
        assertEquals(3, mergedList.next.next.next.val);
        assertEquals(4, mergedList.next.next.next.next.val);
        assertEquals(4, mergedList.next.next.next.next.next.val);
    }

    @Test
    void mergeTwoSortedLists_case2() {
        MergeTwoSortedLists.ListNode list1 = new MergeTwoSortedLists.ListNode(1);
        MergeTwoSortedLists.ListNode list2 = null;

        list1.next = new MergeTwoSortedLists.ListNode(2, new MergeTwoSortedLists.ListNode(4));

        MergeTwoSortedLists.ListNode mergedList = MergeTwoSortedLists.mergeTwoLists(list1, list2);

        assertEquals(1, mergedList.val);
        assertEquals(2, mergedList.next.val);
        assertEquals(4, mergedList.next.next.val);

    }

    @Test
    void mergeTwoSortedLists_case3() {
        MergeTwoSortedLists.ListNode list1 = null;
        MergeTwoSortedLists.ListNode list2 = null;

        MergeTwoSortedLists.ListNode mergedList = MergeTwoSortedLists.mergeTwoLists(list1, list2);

        assertEquals(null, mergedList);
    }

    @Test
    void mergeTwoSortedLists_case4() {
        MergeTwoSortedLists.ListNode list1 = null;
        MergeTwoSortedLists.ListNode list2 = new MergeTwoSortedLists.ListNode(1);

        list2.next = new MergeTwoSortedLists.ListNode(3, new MergeTwoSortedLists.ListNode(4));

        MergeTwoSortedLists.ListNode mergedList = MergeTwoSortedLists.mergeTwoLists(list1, list2);

        assertEquals(1, mergedList.val);
        assertEquals(3, mergedList.next.val);
        assertEquals(4, mergedList.next.next.val);
    }
}