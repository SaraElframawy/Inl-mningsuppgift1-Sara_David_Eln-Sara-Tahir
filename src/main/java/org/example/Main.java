package org.example;

import javax.swing.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        char operation = 0;

        Operations operations = new Operations();

      int number1;
        int number2;
        int result = 0;
  var scan = new Scanner(System.in);
//System.out.println("which operation do you want to use ?");
  //operation = scan.next().charAt(0);


        getOperation(scan,operation);
  System.out.println("First number?");
  number1 = scan.nextInt();
        System.out.println("second number?");
        number2 = scan.nextInt();

  switch (operation){
      case '+' :
          
          result = operations.add(number1,number2);
          break;

      case  '-':
        result =  operations.sub(number1,number2);
          break;
      case '*':
        result =  operations.multi(number1,number2);
          break;
      case '/':
        result =  operations.divide(number1,number2);
        if (number2 == 0){
            JOptionPane.showMessageDialog(null, "Du kan inte dividera med null");
            throw  new ArithmeticException ("you can't divide with zero");
        }
          break;
      default: System.out.println("you didn't write the right operation");
      }
      System.out.println("The outcome is "+ result);

    }
    public static char getOperation(Scanner scan, char o) {
        System.out.println("Which operation do you want to use?");
         o = scan.next().charAt(3);
        return o;
    }
}