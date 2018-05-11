/*
 * Created by Matthew Harker and Gabriel Anderson
 */


package finalproject;

import java.util.Scanner;

public class FinalProject
{
    public static void main(String[] args)
    {
        CPassword password = new CPassword();
        password.setPassword(createPassword());
        if (password.checkPassword())
            System.out.println("The password is valid");
        else
            System.out.println("The password is invalid");
    }
    
    /**
     * Prompts the user to create a password
     * 
     * @return the chosen password
     */
    private static String createPassword()
    {
        String psw;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter password: ");
        
        psw = keyboard.next();
        
        return psw;
        
    }
}
