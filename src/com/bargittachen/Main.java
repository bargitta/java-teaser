package com.bargittachen;

import java.util.concurrent.atomic.AtomicReference;

public class Main {

    public static void main(String[] args) {
        LinkNode head = LinkedList.createLinkList(new int[]{1, 2, 3, 4});
        LinkedList.printList(head);

        System.out.println();
        LinkedList.printListReversly(head);
        AtomicReference<LinkNode> refHead = new AtomicReference<LinkNode>(head);
        LinkedList.addToTail(refHead, 20);
        LinkedList.printList(head);
    }
}
