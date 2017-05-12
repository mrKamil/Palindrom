package service;

/**
 * Created by Kamil on 2016-11-20.
 */
public class Palindrom {

    public char[] reverse(String word) {


        char charArray[] = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            charArray[i] = word.charAt(word.length() - i - 1);
        }
        return charArray;


    }


}
