package Unit3;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Iterator itr = list.descendingIterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Min "+list.getFirst());
        System.out.println("Max "+list.getLast());
    }
}
