package Unit3;
import java.util.*;
public class LinkedHashMap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int marks = sc.nextInt();
            map.put(name, marks);
        }
//        for (Map.Entry m : map.entrySet()) {
//            System.out.println(m.getKey() + " " + m.getValue());
//        }
        for(String st : map.keySet()){
            System.out.println(st+" "+map.get(st));
        }
    }
}
