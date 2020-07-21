package exercises;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        if (length1 != length2) {
            return false;
        }

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        for (int n = 0; n < length1; n++) {
            if (word1Array[n] != word2Array[n]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("cinema", "iceman"));
    }

    }
