package javapractice;

import java.util.Arrays;

public class MergeSort {
    private static String[] mergeSort(String[] words) {
        if(words.length == 1)
            return words;

        int mid = words.length/2;
        String[] left = mergeSort(Arrays.copyOfRange(words,0,mid));
        String[] right = mergeSort(Arrays.copyOfRange(words,mid,words.length));

        return merge(left,right);
    }

    private static String[] merge(String[] first, String[] second) {
        String[] sortedWords = new String[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while(i < first.length & j < second.length) {
            if(first[i].compareTo(second[j]) < 0)
                sortedWords[k++] = first[i++];
            else
                sortedWords[k++] = second[j++];
        }

        while(i < first.length)
            sortedWords[k++] = first[i++];
        while(j < second.length)
            sortedWords[k++] = second[j++];

        return sortedWords;
    }

    public static void main(String args[]) {
        String[] userWords = {"Kali", "Muthu", "Rama", "Chandran", "Mugundhan", "Santhi", "Geetha"};
        String[] sortedUserWords = mergeSort(userWords);
        System.out.println(Arrays.toString(sortedUserWords));
    }
}
