class ListNode {
    int val;
    ListNode next;
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    ListNode(int val) {
        this(val, null);
    }
}

public class MyLinkedList {
    ListNode head;
    int size;

    public MyLinkedList() {
        head = new ListNode(0, null);
        size = 0;
    }

    private ListNode getPrev(int index) {
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public int get(int index) {
        if (index >= size) {
            return -1;
        }
        return getPrev(index).next.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        ListNode prev = getPrev(index);
        ListNode node = new ListNode(val, prev.next);
        prev.next = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }
        ListNode prev = getPrev(index);
        prev.next = prev.next.next;
        size--;
    }
}