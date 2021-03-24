public class ChkPalindrome {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);
        ListNode pHead = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        System.out.println("原链表：");
        print(pHead);

        boolean b = chkPalindrome(pHead);
        System.out.println("是回文结构吗？");
        System.out.println(b);
    }

    public static boolean chkPalindrome(ListNode A) {
        ListNode middle = getMiddle(A);
        ListNode reverseHead = reverseList(middle);

        ListNode curA = A;
        ListNode curB = reverseHead;
        while (curA != null && curB != null) {
            if (curA.val != curB.val) {
                return false;
            }

            curA = curA.next;
            curB = curB.next;
        }

        return true;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    private static ListNode getMiddle(ListNode head) {
        int count = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) {
            count++;
        }

        ListNode ans = head;
        for (int i = 0; i < count / 2; i++) {
            ans = ans.next;
        }

        return ans;
    }

    public static void print(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.println(cur.toString());
            cur = cur.next;
        }
    }
}