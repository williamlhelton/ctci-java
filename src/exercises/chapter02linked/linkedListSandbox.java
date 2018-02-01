package exercises.chapter02linked;

public class linkedListSandbox {
    public static void main(String[] args) {
        /*
        Just playing around with linked lists
        */

        /*
        MySinglyLinkedList<Integer> myList = new MySinglyLinkedList<>();
        myList.append(1);
        myList.append(3);
        myList.append(5);
        myList.printAll();

        MySinglyLinkedList<String> myList2 = new MySinglyLinkedList<>();
        myList2.append("doofus");
        myList2.append("butthead");
        myList2.append("fart");
        myList2.printAll();

        System.out.println();

        myList.delete(3);
        myList.printAll();
        myList2.delete("fart");
        myList2.printAll();
        */

        /*
        Test Question 01
         */
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
        myList3.append(3);
        myList3.append(5);
        myList3.append(1);
        myList3.append(3);
        myList3.append(5);
        myList3.runMethod02();
        myList3.printAll();

        Q01<String> myList4 = new Q01<>();
        myList4.append("terry");
        myList4.append("flappy");
        myList4.append("terry");
        myList4.append("terry");
        myList4.append("terry");
        myList4.append("terry");
        myList4.append("terry");
        myList4.runMethod02();
        myList4.printAll();
    }
}
