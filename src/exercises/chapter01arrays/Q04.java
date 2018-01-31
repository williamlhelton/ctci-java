/*
Palindrome Permutation:  Given a string, write a function to check if it is a permutation of a palin­
drome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
1.5
1.6
EXAMPLE
Input:  Tact Coa
Output:  True (permutations: "taco cat", "atco eta", etc.)
 */
package exercises.chapter01arrays;

import java.util.HashMap;

public class Q04 {
    /*
    Method 01: Use a HashMap and count the times each character occurs.  Then check all values of the HashMap.
    Only one key can have an odd value (can appear in the middle).  If a value is odd, flip a boolean from false to
    true.  If another odd value is found while the boolean is true, return false.
     */
    public boolean runMethod01(String input){
        HashMap<Character, Integer> myMap = new HashMap<>();
        boolean foundOdd = false;

        //count character occurrences
        for(char c : input.toCharArray()){
            if(!myMap.containsKey(c)){
                myMap.put(c, 0);
            }
            myMap.put(c, myMap.get(c) + 1);
        }

        //check for more than one odd count in values
        for(Integer i : myMap.values()){
            if(i%2 == 0) continue;
            if(foundOdd)
                return false;
            foundOdd = true;
        }
        return true;
    }
}
