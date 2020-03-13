package isograms;

import java.util.Hashtable;

public class isograms {

    public static Boolean isogram(String s) {
       Hashtable<Character, Character> bag = new Hashtable<Character, Character>();

       for (int i=0; i < s.length(); i++) {
           char c = Character.toLowerCase(s.charAt(i));
//           char c = s.charAt(i);
           if (bag.get(c) != null) {
               System.out.println("no");
               return(false);
           } else {
               bag.put(c, c);
               System.out.println("yes");
           }
       }
       return(true);
    }

    public static void main(String[] args){
       isogram("test");
    }
}
