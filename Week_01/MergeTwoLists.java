/**
 * 题目：合并两个有序链表
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 解法1
        if(null == l1){
            return l2;
        }else if(null == l2){
            return l1;
        }else {
            if(l1.val <= l2.val){
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            }else if(l2.val <= l1.val){
                l2.next = mergeTwoLists(l2.next, l1);
                return l2;
            }
        }
        return new ListNode();
    }
}