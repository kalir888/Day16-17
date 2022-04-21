package javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the number of words");
        int numberOfWords = get.nextInt();
        String[] userWords = new String[numberOfWords];
        System.out.println("Enter your first word");
        for(int i = 0; i < numberOfWords; i++) {
            userWords[i] = get.next();
            System.out.println("Enter your next word");
        }
        System.out.println(Arrays.toString(insertionSort(userWords)));
    }

    private static String[] insertionSort(String[] words) {
        for(int i = 1; i < words.length; i++) {
            for(int j = i; j > 0; j--) {
                if(words[j].compareTo(words[j-1]) < 0) {
                    String temp = words[j-1];
                    words[j-1] = words[j];
                    words[j] = temp;
                }
            }
        }
        return words;
    }
}
