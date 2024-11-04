public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);

        l1.addNode(new ListNode(4));
        l1.addNode(new ListNode(3));

        l2.addNode(new ListNode(6));
        l2.addNode(new ListNode(4));

        int counter = 0;

        System.out.println(l1.val);
        System.out.println(l1.next);

    }
}
