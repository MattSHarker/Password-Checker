package finalproject;

public class CPassword
{
    String password = "";
    
    static final short PASSWORD_LENGTH = 6;
    static final char[] SPECIAL_CHARS = {
        '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+'
    };

    /**
     * Default constructor
     */
    CPassword() {}
    
    /**
     * Constructor which assigns 'password' as the password
     * 
     * @param password - the password
     */
    CPassword(String password)
    {
        this.password = password;
    }
    
    /**
     * Sets the value of the password to password
     * 
     * @param password - the new password
     */
    public void setPassword(String password)
    {
        this.password = password;
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
        if (password == null)
            throw new NullPointerException();
        
        return (password.length() == PASSWORD_LENGTH);
    }
    
    /**
     * Checks if the password has any uppercase characters
     * 
     * @return true if there are any uppercase character
     */
    public boolean upper()
    {
        if (password == null)
            throw new NullPointerException();
        
        boolean hasUpper = false;
        
        for (char c : password.toCharArray())
            hasUpper |= Character.isUpperCase(c);
        
        return hasUpper;
    }
    
    /**
     * Checks if the password has any lowercase characters
     * 
     * @return true if there are any lowercase characters
     */
    public boolean lower()
    {
        if (password == null)
            throw new NullPointerException();
        
        boolean hasLower = false;
        
        for (char c : password.toCharArray())
            hasLower |= Character.isLowerCase(c);
        
        return hasLower;
    }
    
    /**
     * Checks if there are any digits in the password
     * 
     * @return true if there are any digits
     */
    public boolean digit()
    {
        if (password == null)
            throw new NullPointerException();
        
        boolean hasDigit = false;
        
        for (char c : password.toCharArray())
            hasDigit |= Character.isDigit(c);
        
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
        if (password == null)
            throw new NullPointerException();
        
        boolean hasSpecial = false;
        
        for (char special_char : SPECIAL_CHARS)
            hasSpecial |= (password.indexOf(special_char) >= 0);

        return hasSpecial;
    }
    
    /**
     * Check the password to make sure it meets the requirements
     * n 
     * @return true if it meets all of the requirements
     */
    public boolean checkPassword()
    {
        try
        {
            if (!length())
                return false;

            else if (!lower())
                return false;

            else if (!upper())
                return false;

            else if (!digit())
                return false;

            else
                return special();
        }
        catch (NullPointerException e)
        {
            System.out.println("Password cannot be null");
            return false;
        }
        catch (Exception e) {
            return false;
        }
    }
}
