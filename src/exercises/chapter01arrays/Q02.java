/*
Check Permutation:  Given two strings, write a method to decide if one is a permutation of the
other.
 */
package exercises.chapter01arrays;

import java.util.HashMap;

public class Q02 {
    /*
    Method 01: First compare the easy case (check string lengths) to quickly return false.
    Add string characters to their own HashMaps which count characters, then compare the HashMap objects to each other.
     */
    public boolean runMethod01(String str1, String str2){
        //if either string is empty
        if(str1 == null || str2 == null) return false;

        //if string lengths are not equal
        if(str1.length() != str2.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < str1.length(); i++){
            //if character not in map, initialize key with value 0
            if(!map1.containsKey(str1.charAt(i)))
                map1.put(str1.charAt(i), 0);
            if(!map2.containsKey(str2.charAt(i)))
                map2.put(str2.charAt(i), 0);

            //add 1 to value for characters
            map1.put(str1.charAt(i), map1.get(str1.charAt(i))+1);
            map1.put(str2.charAt(i), map2.get(str2.charAt(i))+1);
        }
        return map1.keySet().equals(map2.keySet());
    }
}
