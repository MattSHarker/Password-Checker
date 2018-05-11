package finalproject;

public class CPassword
{
    String password = "";
    final short PASSWORD_LENGTH = 6;
    char[] specialChars ={
        '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+'
    };

    /**
     * Default constructor
     */
    CPassword() {}
    
    /**
     * Constructor which assigns 'str' as the password
     * 
     * @param str - the password
     */
    CPassword(String str)
    {
        password = str;
    }
    
    
    /**
     * Sets the value of the password to psw
     * 
     * @param psw - the new password
     */
    public void setPassword(String psw)
    {
        password = psw;
    }
    
    /**
     * Returns the password
     * 
     * @return the password
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * Checks if the password is the correct length
     *  
     * @return true if it is the correct length
     */
    public boolean length()
    {
        return (password.length() == PASSWORD_LENGTH);
    }
    
    /**
     * Checks if the password has any uppercase characters
     * 
     * @return true if there are any uppercase character
     */
    public boolean upper()
    {
        boolean hasUpper = false;
        
        for (int i = 0; i < password.length(); i++)
            if (Character.isUpperCase((char)password.charAt(i)))
            {
                hasUpper = true;
                //break;
            }
        
        return hasUpper;
    }
    
    /**
     * Checks if the password has any lowercase characters
     * 
     * @return true if there are any lowercase characters
     */
    public boolean lower()
    {
        boolean hasLower = false;
        
        for (int i = 0; i < password.length(); i++)
            if (Character.isLowerCase((char)password.charAt(i)))
            {
                hasLower = true;
                //break;
            }
        
        return hasLower;
    }
    
    /**
     * Checks if there are any digits in the password
     * 
     * @return true if there are any digits
     */
    public boolean digit()
    {
        boolean hasDigit = false;
        
        for (int i = 0; i < password.length(); i++)
            if (Character.isDigit((char)password.charAt(i)))
            {
                hasDigit = true;
                //break;
            }
        
        return hasDigit;
    }
    
    /**
     * Checks if there are any special characters in the password
     * 
     * The password needs to contain at least one of the following
     * characters: ~ ! @ # $ % ^ & * ( ) _ +
     * 
     * @return true if there are any special characters
     */
    public boolean special()
    {
        boolean hasSpecial = false;
        
        for (int i = 0; i < password.length(); i++)
            for (int j = 0; j < specialChars.length; j++)
                if (password.charAt(i) == specialChars[j])
                    hasSpecial = true;
        
        return hasSpecial;
    }
    
    /**
     * Check the password to make sure it meets the requirements
     * n 
     * @return true if it meets all of the requirements
     */
    public boolean checkPassword()
    {
        if (!length())
            return false;
        
        else if (!lower())
            return false;
        
        else if (!upper())
            return false;
        
        else if (!digit())
            return false;
        
        else if (!special())
            return false;
        
        else
            return true;
    }
}
