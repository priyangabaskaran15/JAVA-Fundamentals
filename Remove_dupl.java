import java.util.*;
public class Remove_dupl{
    public static void main(String args[]){
        String s = "Hello";
        LinkedHashSet<Character>set1 = new LinkedHashSet<>(); // To maintain the insertion order as a output
        for(char ch: s.toCharArray()){
            set1.add(ch);
        }
        for(char ch:set1){
             System.out.print(ch);
        }
        System.out.println();
        HashSet<Character>set2 = new HashSet<>(); // removes duplicate but not maintain the inserrtion order 
        for(char ch : s.toCharArray()){
            set2.add(ch);
        }
        System.out.println(set2);

       
    }
}
// HashSet -> Removes the duplicates but do not maintain the insertion order
// LinkedHashSet -> Removes duplicates and maintains the insertion order 