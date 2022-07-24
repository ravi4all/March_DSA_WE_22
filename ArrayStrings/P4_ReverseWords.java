package ArrayStrings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P4_ReverseWords {
    static String reverse(String str) {
        int i = 0;
        int j = str.length() - 1;
        char wordArr[] = str.toCharArray();
        char temp;
        while(i < j) {
            temp = wordArr[i];
            wordArr[i] = wordArr[j];
            wordArr[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(wordArr);
    }
    static String approach_1(String str) {
        String rev = reverse(str);
        String wordArr[] = rev.split(" ");
        String sentence = "";
        for(String word: wordArr) {
            if(word.equals("")) {
                continue;
            }
            sentence += reverse(word) + " ";
        }
        return sentence;
    }

    static String approach_2(String str) {
        List<String> wordsList = Arrays.asList(str.split(" "));
        Collections.reverse(wordsList);
        return String.join(" ", wordsList);
    }
}
