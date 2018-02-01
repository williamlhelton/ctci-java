package CtciLibrary;

public class MySinglyLinkedList<T> {
    //this class always knows where the head Node is, but no other Nodes
    private Node head;

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
