package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password;
        int counter;
        int numbers;

         do { 
          password = input.next();
          counter = 0;
          numbers = 0;

          for ( int i = 0 ; i < password.length() ; i++) {
          int digit = password.charAt(i);
            if (Character.isLetterOrDigit(digit)) {
              counter++;
              if (Character.isDigit(digit)) {
                numbers++;
                }
              }
            }
        }
        while (password.length() < 8 || counter < password.length() || numbers < 2 ) ;
        System.out.println("Password valid!");
         
    }
}
