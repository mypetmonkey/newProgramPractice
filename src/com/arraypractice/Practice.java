package com.arraypractice;

import java.util.*;

public class Practice {
	public static void main(String[] args) {
        String inputString = "aabbbccccddddd111111111";
        char mostRepeatingChar = findMostRepeatingChar(inputString);

        System.out.println("Most repeating character: " + mostRepeatingChar);
    }

	
	
    static char findMostRepeatingChar(String st) {
        int[] charCount = new int[128]; 
        for (char c : st.toCharArray()) {
            if (Character.isLetter(c)) { 
                charCount[c]++;
           }
        }
        char mostRepeatingChar = '\0'; 
        int maxCount = 0;
        for (int i = 0; i < charCount.length; i++) {
            if (Character.isLetter((char) i) && charCount[i] > maxCount) {
                maxCount = charCount[i];
                mostRepeatingChar = (char) i;
            }
        }
        return mostRepeatingChar;
    }

}
