package Shuffle;

import java.util.HashMap;
import java.util.Map;


public class  ValidShuffle{
    static boolean validShuffle(String str1, String str2,
                                String shuffle)
    {
        int n1 = str1.length();
        int n2 = str2.length();
        int n = shuffle.length();

        if (n != n1 + n2) {
            return false;
        }

        HashMap<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < n1; i++) {
            freq.put(str1.charAt(i),
                     freq.getOrDefault(str1.charAt(i), 0)
                         + 1);
        }

        for (int i = 0; i < n2; i++) {
            freq.put(str2.charAt(i),
                     freq.getOrDefault(str2.charAt(i), 0)
                         + 1);
        }

        for (int i = 0; i < n; i++) {
            if (freq.containsKey(shuffle.charAt(i))) {
                freq.put(shuffle.charAt(i),
                         freq.get(shuffle.charAt(i)) - 1);
            }
            else {
                return false;
            }
        }

        // Checks whether all the elements's frequency in
        // hashmap becomes 0
        for (Map.Entry<Character, Integer> entry :
             freq.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        String str1 = "BA";
        String str2 = "XY";
        String shuffle = "ABYX";

        if (validShuffle(str1, str2, shuffle)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

