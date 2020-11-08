package exercise6;

import java.util.Scanner;
import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean palindrom = true;
        int numbers = input.nextInt();
        int length = 0;
        long temp = 1;
        int counter = 0;
        
        assert numbers > 0;
        
        while (temp <= numbers) {
          length++;
          temp *= 10;
        }
        
        int[] righttoleft = new int[length];
        int[] lefttoright = new int[length];
        
        for (int i = length - 1; i >= 0; i--) {
          int digit = (int) (numbers/ Math.pow(10, i))% 10;
          righttoleft[i] = digit;
        }
        for (int i = 0; i < length; i++) {
          int digit = (int) (numbers/ Math.pow(10, ((length - 1) -i)))% 10;
          lefttoright[i] = digit;
          if( righttoleft[i] != lefttoright[i]) {
            counter++;
          }
        }
    
        String rtlAsString = Arrays.toString(righttoleft);
        System.out.println("First Array: " + rtlAsString);
        String ltrAsString = Arrays.toString(lefttoright);
        System.out.println("Second Array: " + ltrAsString);

      if (counter > 0) {
          palindrom = false;
        }
      
      System.out.println("Palindrome: " + palindrom);   
    }
}
