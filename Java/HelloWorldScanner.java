import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String input = "";
    String helloWrld = "Hello World!";
    Scanner scan = new Scanner(System.in);
    System.out.println("Type 'Hello World!' : ");
    input = scan.nextLine();

    while(!input.equals(helloWrld)) {
      System.out.println("Incorrect, try again: ");
      input = scan.nextLine();
      if(input.equals(helloWrld)) {
        System.out.println("Hello to you too!");
        scan.close();
        break;
      }
    }
  }
}
