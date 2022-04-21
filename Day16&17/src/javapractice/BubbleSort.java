package javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter how many numbers you are going to enter");
        int userCount = get.nextInt();
        int[] userInts = new int[userCount];
        System.out.println("Enter the first number");
        for(int i = 0; i < userInts.length; i++) {
            userInts[i] = get.nextInt();
            System.out.println("Enter your next number");
        }
        int DONE = 0;
        int NOT_DONE = 1;
        System.out.println("Array before sorting" + Arrays.toString(userInts));
        for(int i = 1; i < userInts.length; i++) {
            int swapCheck = NOT_DONE;
            for(int j = 0; j < userInts.length-i; j++) {
                if(userInts[j] > userInts[j+1]) {
                    int temp = userInts[j];
                    userInts[j] = userInts[j+1];
                    userInts[j+1] = temp;
                    swapCheck = DONE;
                }
            }
            if(swapCheck == NOT_DONE)
                break;
        }
        System.out.println("The Sorted List is " + Arrays.toString(userInts));
    }
}
