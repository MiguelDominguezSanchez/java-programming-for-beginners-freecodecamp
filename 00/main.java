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

/*
ARRAYS
import java.util.Arrays;

class Main {
  public static void main(String[] args) {

    int numbers[] = {1, 2, 3, 4, 5};

    // int startingIndex = 1;
    // int endingIndex = 4;
    // int endingIndex = 10;

    int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);
    // nt copyOfNumbers[] = Arrays.copyOf(numbers, 10);
    // int copyOfNumbers[] = Arrays.copyOf(numbers, 2);
    // int copyOfNumbers[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);
    
    //  Arrays.fill(numbers, 0);

    // create object array with 5 positions
    // char vowels[] = new char[5];
    // char vowels[] = {'a', 'e', 'i', 'o', 'u' };
    // char vowels[] = {'e', 'u', 'a', 'o', 'i' };

    // vowels[2] = 'x';

    
    // a e i o u
    // vowels[0] = 'a';
    // vowels[1] = 'e';
    // vowels[2] = 'i';
    // vowels[3] = 'o';
    // vowels[4] = 'u';
    

    // int startingIndex = 1;
    // int endingIndex = 4;

    // Arrays.sort(vowels, startingIndex, endingIndex);

    // Arrays.sort(vowels);

    // int startingIndex = 1;
    // int endingIndex = 4;

    // Arrays.fill(vowels, startingIndex, endingIndex, 'x');

    // int startingIndex = 1;
    // int endingIndex = 4;

    // char key = 'o';
    // char key = 'x';
    // char key = 'b';

    // int foundItemIndex = Arrays.binarySearch(vowels, startingIndex, endingIndex, key);
    // int foundItemIndex = Arrays.binarySearch(vowels, key);

    // System.out.println(Arrays.toString(vowels));
    // System.out.println(vowels.length);
    // System.out.println(foundItemIndex);

    // System.out.println(Arrays.toString(numbers));
    // System.out.println(Arrays.toString(copyOfNumbers));
    // System.out.println(numbers == copyOfNumbers);
    System.out.println(Arrays.equals(numbers, copyOfNumbers));
  }
}
 */