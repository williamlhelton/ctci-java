/*
Delete Middle Node:  Implement an algorithm to delete a node in the middle (i.e., any node but
the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
that node.
EXAMPLE
Input:the node c from the linked list a->b->c->d->e->f
Result: nothing is returned, but the new linked list looks like a->b->d->e->f
 */

package exercises.chapter02linked;

public class Q03 {
    /*
    Method 01: We can access the current node and any nodes that come afterwards but not before.
    Copy the next node to the target node, overwriting it.
     */
    public static void runMethod01(Node target){
        if(target == null || target.next == null) return;
        target.data = target.next.data;
        target.next = target.next.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(2);
        Node target = new Node(3);
        head.next.next = target;
        head.append(4);
        head.append(5);

        head.printAll(head);
        runMethod01(target);
        head.printAll(head);
    }
}

class Node{
    Node next = null;
    int data;

    Node(int d){
        data = d;
    }

    void append(int d){
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public void printAll(Node head){
        Node i = head;
        int count = 0;
        while(i.next != null){
            System.out.println("Node " + count + ": " + i.data);
            i = i.next;
            count++;
        }
        System.out.println("Node " + count + ": " + i.data);
    }
}