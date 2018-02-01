/*
    Chapter 02, Question 01
    Remove Dups: Write code to remove duplicates from an unsorted linked list.

    FOLLOW UP
    How would you solve this problem if a temporary buffer is not allowed?
 */

package exercises.chapter02linked;

import java.util.HashSet;

public class Q01<T> extends MySinglyLinkedList {
    /*
    Method 01: Use a HashSet to add all values as you iterate through the list.
    If the value has already existed, delete it.
     */
    public void runMethod01(){
        HashSet<T> mySet = new HashSet<>();
        Node current = head;
        Node previous = null;

        while(current != null){
            T currentData = (T) current.data;

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
    
    //test methods
    public static void main(String[] args) {
        Q01<Integer> myList = new Q01<>();
        myList.append(1);
        myList.append(3);
        myList.append(3);
        myList.append(5);
        myList.append(3);
        myList.append(5);
        myList.append(1);
        myList.append(3);
        myList.append(5);
        myList.runMethod01();
        myList.printAll();

        Q01<String> myList2 = new Q01<>();
        myList2.append("terry");
        myList2.append("flappy");
        myList2.append("terry");
        myList2.append("terry");
        myList2.append("terry");
        myList2.append("terry");
        myList2.append("terry");
        myList2.runMethod01();
        myList2.printAll();

        Q01<Integer> myList3 = new Q01<>();
        myList3.append(1);
        myList3.append(3);
        myList3.append(3);
        myList3.append(5);
        myList3.append(5);
        myList3.append(3);
        myList3.append(5);
        myList3.append(1);
        myList3.append(3);
        myList3.append(5);
        myList3.runMethod01();
        myList3.printAll();

        Q01<String> myList4 = new Q01<>();
        myList4.append("terry");
        myList4.append("flappy");
        myList4.append("terry");
        myList4.append("terry");
        myList4.append("terry");
        myList4.append("terry");
        myList4.append("terry");
        myList4.runMethod01();
        myList4.printAll();
    }
}
