package Unit3;
import java.util.*;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Character,Integer> tm = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(char c : str.toCharArray()){
            tm.put(c,tm.getOrDefault(c,0)+1);
        }
        for(Map.Entry m : tm.entrySet()){
            System.out.print(m.getKey()+" "+m.getValue()+" ");
        }
    }
}
