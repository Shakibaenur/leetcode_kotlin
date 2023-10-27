package leetcode_1832;

import java.util.HashSet;

public class Pangram {
    public boolean checkIfPangram(String sentence) {
        char[] arr=sentence.toCharArray();
        HashSet<Character> set=new HashSet<>();
        //Hashset will store all the non duplicate value
        for(char ch:arr){
            set.add(ch);
        }
        //if hash set size is equal to our 26 alphabet then return true else false
        if(set.size()==26)
            return true;
        return false;
    }
}
