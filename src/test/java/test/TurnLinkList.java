package test;

import java.util.List;
import java.util.Stack;

/**
 * @author laijunlin
 * @date 2021-03-07 16:22
 */
public class TurnLinkList {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode turnNode = ReverseList(listNode1);
        while (turnNode != null){
            System.out.println(turnNode.val);
            turnNode = turnNode.next;
        }
    }

    public static ListNode ReverseList(ListNode head) {
        Stack<Integer> stack = new Stack();
        while (head != null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode newHead  = new ListNode(-1);
        ListNode result  = newHead;
        while(!stack.isEmpty()){
            ListNode temp = new ListNode(stack.pop());
            newHead.next = temp;
            newHead = newHead.next;
        }
        return result.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
