package hw9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tree {
    private static void FindCommonElemet(String[] arr1,String[] arr2)
    {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("A,J,L,P,S,Q,D,W,N,Z");
        TreeSet<String> t = new TreeSet<>();
        t.add("M,A,N,X,V,S,D,K,U,Y");
        ts.addAll(t);
        System.out.println("Elements in the TreeSet after addAll operation: " + ts);
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {

                    // add common elements
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (String i : set) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {

        String[] ts = { "A", "J", "L", "P", "S","Q","D","W","N","Z" };

        String[] t = { "M", "A", "N","X","V","S","D","K","U","Y" };

        System.out.println("Array 1: " + Arrays.toString(ts));

        System.out.println("Array 2: " + Arrays.toString(t));

        System.out.print("Common Elements: ");

        // Find the common elements
        FindCommonElemet(ts, t);
    }
}


