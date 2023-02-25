import java.util.Scanner;  // Import the Scanner class

class arithmetic {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    // System.out.println("Enter username");

    // String userName = myObj.nextLine();  // Read user input
    // System.out.println("Username is: " + userName);
    System.out.println("Enter a : ");
    int p = myObj.nextInt();
    System.out.println("Enter b : ");
    int q = myObj.nextInt();
    System.out.println("The sum ="+(p+q));
  }
}