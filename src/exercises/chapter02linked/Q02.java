/*
Return Kth to Last:  Implement an algorithm to find the kth to last element of a singly linked list.
 */
package exercises.chapter02linked;

public class Q02<T> extends MySinglyLinkedList{
    /*
    Method 01: Count the size of the linked list 0(n) by iterating through the list.
    Then return to the head and return the n-k element.
     */
    public T runMethod01(int k){
        Node myNode = head;
        int listSize = 0;

        //get size
        while(myNode.next != null){
            myNode = myNode.next;
            listSize++;
        }

        //put target element into k and reset node to start
        k = listSize - k;
        myNode = head;

        //find element
        for(int i = 0; i < k; i++){
            myNode = myNode.next;
        }
        return (T) myNode.data;
    }

    /*
    Method 02: Use two Node pointers, both starting at head.  Move one pointer k elements.
    Then move both pointers until one hits the end.  The other pointer will be at n-k.
     */
    public T runMethod02(int k){
        Node frontNode = head;
        Node backNode = head;

        for(int i = 0; i < k; i++){
            frontNode = frontNode.next;
        }

        while(frontNode.next != null){
            frontNode = frontNode.next;
            backNode = backNode.next;
        }

        return (T) backNode.data;
    }

    public static void main(String[] args) {
        Q02<Integer> myList = new Q02<>();
        myList.append(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);
        System.out.println(myList.runMethod01(0));
        System.out.println(myList.runMethod01(3));
        System.out.println(myList.runMethod01(4));

        Q02<String> myList2 = new Q02<>();
        myList2.append("one");
        myList2.append("two");
        myList2.append("three");
        myList2.append("four");
        myList2.append("five");
        System.out.println(myList2.runMethod01(1));
        System.out.println(myList2.runMethod01(2));
        System.out.println(myList2.runMethod01(4));

        Q02<Integer> myList3 = new Q02<>();
        myList3.append(1);
        myList3.append(2);
        myList3.append(3);
        myList3.append(4);
        myList3.append(5);
        System.out.println(myList3.runMethod02(0));
        System.out.println(myList3.runMethod02(3));
        System.out.println(myList3.runMethod02(4));

        Q02<String> myList4 = new Q02<>();
        myList4.append("one");
        myList4.append("two");
        myList4.append("three");
        myList4.append("four");
        myList4.append("five");
        System.out.println(myList4.runMethod02(1));
        System.out.println(myList4.runMethod02(2));
        System.out.println(myList4.runMethod02(4));
    }
}
