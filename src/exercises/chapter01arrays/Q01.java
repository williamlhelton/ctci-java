/*
Is Unique:  Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
*/
package exercises.chapter01arrays;

import java.util.HashMap;

public class Q01 {
    /*
    Method 01: Add every character to a HashMap and return false as soon as a character is added a second time.
     */
    public boolean runMethod01(String s){
        HashMap<Character, Boolean> myMap = new HashMap<>();
        for(char c : s.toCharArray()){
            if (myMap.containsKey(c)) {
                return false;
            }
            myMap.put(c, true);
        }
        return true;
    }

    /*
    Method 02: With no additional data structures, brute force a solution by checking every character O(n^2)
     */
    public boolean runMethod02(String s){
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < s.length(); j++){
                if(i == j) continue;
                if(s.charAt(i) == s.charAt(j)) return false;
            }
        }
        return true;
    }
}
