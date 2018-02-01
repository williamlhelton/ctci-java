/*
    Chapter 02, Question 01
    Remove Dups: Write code to remove duplicates from an unsorted linked list.

    FOLLOW UP
    How would you solve this problem if a temporary buffer is not allowed?
 */

package exercises.chapter02linked;

import java.util.HashSet;

public class Q01<T> {
    //this class always knows where the head Node is, but no other Nodes
    private Node head;

    /*
    Method 01: Use a HashSet to add all values as you iterate through the list.
    If the value has already existed, delete it.
     */
    public void runMethod01(){
        HashSet<T> mySet = new HashSet<>();
        Node current = head;
        Node previous = null;

        while(current != null){
            T currentData = current.data;

            //if data is in set, connect previous Node to next Node, skipping current Node
            //else add the data to the set and move previous up
            if(mySet.contains(currentData)){
                previous.next = current.next;
            } else {
                mySet.add(currentData);
                previous = current;
            }
            current = current.next;
        }
    }

    /*
    Method 02: With no buffer (set), you can force a solution by running both a "current" Node pointer
    and a "comparator" Node pointer to the end using two while loops, and deleting any duplicates found
    by the comparator.  O(n^2) is not great but it's easy on space.
     */
    public void runMethod02(){
        Node current = head;
        while(current != null){
            Node comparator = current;
            while(comparator.next != null){
                if(current.data.equals(comparator.next.data)){
                    comparator.next = comparator.next.next;
                } else{
                    comparator = comparator.next;
                }
            }
            current = current.next;
        }
    }

    public void append(T data){
        //create new tail to eventually place at end
        Node newTail = new Node(data);

        //if list is empty, create single Node and return
        if(head == null){
            head = new Node(data);
            return;
        }

        //find the current tail by iterating through linked list
        Node currentTail = head;
        while(currentTail.next != null){
            currentTail = currentTail.next;
        }

        //add new tail to list
        currentTail.next = newTail;
    }

    //deletes first node with given data
    public void delete(T data){
        Node searchNode = head;

        //if data found in head, just move head pointer and return
        if(searchNode.data == data){
            head = head.next;
            return;
        }

        //otherwise search through all Nodes
        while(searchNode.next != null){
            if(searchNode.next.data == data){
                searchNode.next = searchNode.next.next;
                return;
            }
            searchNode = searchNode.next;
        }
    }

    //print all Nodes in order
    public void printAll(){
        Node i = head;
        int count = 0;
        while(i.next != null){
            System.out.println("Node " + count + ": " + i.data.toString());
            i = i.next;
            count++;
        }
        System.out.println("Node " + count + ": " + i.data.toString());
    }

    //Nodes are not directly accessible, but wrapped in the MySinglyLinkedList class
    //Initializing a new Node always lets next be null
    private class Node{
        private Node next;
        private T data;

        //constructor
        Node(T data){
            this.data = data;
        }
    }
}
