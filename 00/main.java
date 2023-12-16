/*
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("What is your name? \n");
    String name = scanner.nextLine();

    System.out.printf("Hello %s. How old are you? ", name);
    int age = scanner.nextInt();

    System.out.printf("%d is an excellent age to start programming.", age);

    scanner.close();
  }
}
*/ 

/*
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("What is your name? \n");
    String name = scanner.nextLine();

    System.out.printf("Hello %s. How old are you? ", name);
    int age = Integer.parseInt(scanner.nextLine());
    
    System.out.printf("%d is an excellent age to start programming. What language do you prefer?", age);
    String language = scanner.nextLine();

    System.out.printf("%s is a very popular programming language.", language);

    scanner.close();
  }
}
*/

/* 
Calculator application
if else statements

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    double number1 = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Enter the second number: ");
    double number2 = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("What operation do you want to perform? ");
    String operation = scanner.nextLine();

    if (operation.equals("sum")) {
      System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
    } else if (operation.equals("sub")) {
      System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
    } else if (operation.equals("mul")) {
      System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
    } else if (operation.equals("div")) {
      if (number2 == 0) {
        System.out.println("Can not divide by zero.");
      } else {
        System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
        }
      } else {
      System.out.printf("%s is not a supportedd operation.", operation);
    }

    scanner.close();
  }
}
*/

/*
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    double number1 = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Enter the second number: ");
    double number2 = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("What operation do you want to perform? ");
    String operation = scanner.nextLine();

    switch (operation) {
      case "sum":
        System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        break;
      case "sub":
        System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
        break;
      case "mul":
        System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
        break;
      case "div":
        if (number2 == 0) {
          System.out.println("Cannot divide by zero.");
        } else {
          System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
        }
        break;
      default:
        System.out.printf("%s is not a supported operation.", operation);
        
    }

    scanner.close();
  }
}

 */