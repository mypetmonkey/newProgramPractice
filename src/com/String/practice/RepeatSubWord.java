package com.String.practice;

public class RepeatSubWord {
	
	public static void main(String[] args) {
        String st= "webapiweb";
        String res=repeatWord(st);
        System.out.println("Longest Repeating Substring: " +res);
     }

    static String repeatWord(String s) {
        String sub= "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <s.length(); j++) {
                String value=s.substring(i, j);
                int len =value.length();

                // Check if the substring repeats and is longer than the current longest
                if (s.substring(j).contains(value) && len > sub.length()) {
                    sub=value;
                }
            }
        }
        if (sub.length() > 0) {
            return sub;
        } else {
            return "No repeating substring found";
        }
    }

}
