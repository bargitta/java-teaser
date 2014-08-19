package com.bargittachen;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by xichen on 8/12/14.
 */
public class LinkedList {

    //在链表尾部添加一个节点
    //当链表头为空，创建一个新的节点，由于java传值使用拷贝，所有此处用AtomicReference
    public static void addToTail(AtomicReference<LinkNode> head, int number){
        if(head.get() == null)
        {
            head.set(new LinkNode(number));
        }
        LinkNode tail = head.get();
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = new LinkNode(number);
    }

    //删除链表中等于输入值的第一个节点
    /**
     * 输入链表的头节点，从尾到头打印
     */
    public static void printListReversly(LinkNode head){
        Stack<Integer> stack = new Stack<Integer>();
        while(head != null){
            stack.push(head.value);
            head = head.next;
        }
        while (!stack.empty()){
            System.out.print(stack.pop());
        }

    }

    /**
     * 打印链表
     * @param head
     */

    public static void printList(LinkNode head){
        while (head != null){
            System.out.print(head.value + " ");
            head = head.next;
        }
    }

    /**
     * 创建链表
     * @param numbers
     * @return
     */
    public static LinkNode createLinkList(int[] numbers){
        LinkNode head = null;
        LinkNode tail = null;
        if(numbers != null){
            for(int i = 0; i < numbers.length; i++) {
                LinkNode node = new LinkNode(numbers[i]);
                node.next = null;
                if(head == null){
                    head = node;
                }if(tail == null){
                    tail = node;
                }

                tail.next = node;

                tail = tail.next;
            }
        }
        return head;
    }
    /**
     * 逆序创建链表
     * @param numbers
     * @return
     */
    public static LinkNode createLinkListReversly(int[] numbers){
        LinkNode head = null;
        if(numbers != null) {
            for (int i = 0; i < numbers.length; i++) {
                LinkNode node = new LinkNode(numbers[i]);
                node.next = head;
                head = node;
            }
        }
        return head;
    }
}

