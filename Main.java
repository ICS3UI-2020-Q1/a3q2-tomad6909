import java.util.Scanner;
/**
 * This program helps user identify items in the natural world
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // import scanner for user input
    Scanner input = new Scanner(System.in);

    // ask user if the animal has feathers
    System.out.println("Does the animal have feathers?");
    String feathers = input.nextLine();

    if(feathers.equals("yes")){
      System.out.println("Does the animal swim?");
      String swim = input.nextLine();
      if(swim.equals("yes")){
      System.out.println("This is a duck");
      }
    }else{
      System.out.println("Does the animal have legs?");
      String legs = input.nextLine();
      if(legs.equals("yes")){
        System.out.println("This is a lizard");
      }
    }
    
  }
}
