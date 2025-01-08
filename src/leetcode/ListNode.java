package leetcode;

public class ListNode {
    int val;
    ListNode next = null;

    public ListNode(){}
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    public void addNode(ListNode node){
        this.val = node.val;
        this.next = node.next;
    }


}
