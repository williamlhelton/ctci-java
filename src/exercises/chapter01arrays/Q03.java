/*
URLify:  Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.)

EXAMPLE
Input:  "Mr John Smith",  13
Output:  "Mr%20John%20Smith"

Needed hint:
It's often easiest to modify strings by going from the end of the string to the beginning.
*/
package exercises.chapter01arrays;

public class Q03 {
    /*
    Method 01: Split the string into a character array.  Start at the end, and move each character
    to the right.

    Note: I did not figure this out on my own.  This is the textbook solution.  I could not figure
    out how to count the spaces properly.  Will revisit in future.
     */
    public void runMethod01(char[] str, int trueLength){
        int spaceCount = 0, index, i = 0;
        for(i = 0; i < trueLength; i++){
            if(str[i] == ' '){
                spaceCount++;
            }
        }
        index = trueLength + spaceCount * 2;
        if(trueLength < str.length) str[trueLength] = '\0'; // End array
        for(i = trueLength - 1; i >= 0; i--){
            if(str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index-1] = str[i];
                index--;
            }
        }
    }

    /*
    Method 02: The cheating easy way, using many Strings.  Doesn't meet requirements but gives right output.
    Also can (and should) be done with StringBuilder.
     */
    public String runMethod02(String input){
        String output = "";
        input = input.trim();
        for(char c : input.toCharArray()){
            if(c == ' '){
                output = output + "%20";
            } else {
                output = output + c;
            }
        }
        return output;
    }
}
