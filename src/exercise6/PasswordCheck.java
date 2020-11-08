package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password = input.next();
        int counter = 0;
        int numbers = 0;

        assert password.length() > 7;
        
        for ( int i = 0 ; i < password.length() ; i++) {
        int digit = password.charAt(i);
          if (Character.isLetterOrDigit(digit)) {
            counter++;
            if (Character.isDigit(digit)) {
              numbers++;
            }
          }
        }
        if (counter == password.length() && numbers > 1 ) {
          System.out.println("Password valid!");
        }
    }
}
