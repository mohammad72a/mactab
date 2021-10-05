package hw9;

import java.util.*;

public class Hash {
    public void printPermutations(String s) {
        permutationHelper(prepareHashMap(s), "", s.length());
    }
    private HashMap<Character, Integer> prepareHashMap(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        return map;
    }

    private void permutationHelper(HashMap<Character, Integer> map, String permutation, int remainingChars) {

        if (remainingChars == 0) {
            System.out.println(permutation);
        } else {
            for (char c : map.keySet()) {

                if (map.get(c) > 0) {

                    String nextPermutation = permutation + c;

                    map.put(c, map.get(c) - 1);

                    permutationHelper(map, nextPermutation, remainingChars - 1);

                    map.put(c, map.get(c) + 1);
                }
            }

        }

    }
    public static void main(String[] args) {

        Hash sp=new Hash();
        sp.printPermutations("CAT");
    }

}


