import java.util.Scanner;

/**
 * Write a description of class Login here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Login extends Menu
{
  public static void main(String[] args){
        
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");   
    System.out.println("  Welcome To Customer Record System   \n");
    System.out.println("           Login Screen               \n");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"); 
       

        // you need to initialize these to some value or else there is
        // nothing to compare them with. I tried some dummy values and
        // your code worked as expected, as long as the user entered the
        // correct values in the prompt.
        String ManagerName;
        String ManagerPassword;
        String EmployeeName = "Test";
        String EmployeePassword = "Test";

        // you can just use one Scanner for the whole program, since they are
        // both just reading input from the standard input stream. Replace the
        // other Scanners with "input" and close "input" at the end
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        // not needed
        Scanner authenticate = new Scanner(System.in);
        String userName = authenticate.nextLine();
        System.out.println("Your username is " + userName);

        System.out.println("Enter your password: ");
        String passWord = authenticate.nextLine();
        System.out.println("Your password is " + passWord);

        if (userName.equals(userName) && passWord.equals(passWord)) {

            // this could be declared at the top of the program instead of
            // redeclaring in the if...else
            int selection;

            Scanner ManagerMenu = new Scanner(System.in);
            System.out.println("1. Setup Worker Schedule");
            System.out.println("2. View Worker Schedule");
            System.out.println("3. Move Worker");
            System.out.println("4. Quit");

            do {
                selection = ManagerMenu.nextInt();

                if (selection == 1) {
                    System.out.println("1");
                }
                else if (selection == 2) {
                    System.out.println("2");
                }
                else if (selection == 3) {
                    System.out.println("3");
                }
                else {
                    System.out.println("4");
                }  
            } while(selection != 4); // this is usually here
                ManagerMenu.close();
        }
        else if (userName.equals(EmployeeName) && passWord.equals(EmployeePassword)) {

            // this could be declared at the top of the program instead of
            // redeclaring in the if...else
            int selection;

            // don't need this one, just use "input" Scanner
            Scanner EmployeeMenu = new Scanner(System.in);
            System.out.println("1. View Worker Schedule");
            System.out.println("2. Quit");

            do {
                selection = EmployeeMenu.nextInt();

                if (selection == 1) {
                    System.out.println("1");
                }
            } while(selection != 2); // this is usually here

            // you would close the "input" Scanner here
            EmployeeMenu.close();
        }
    }
}