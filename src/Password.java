public class Password
{
    // instance variable
    private String password;

    // constructor
    public Password(String password)
    {
        this.password = password;
    }

    public void setPassword(String newPassword)
    {
        password = newPassword;
    }

    /* Returns true if password:
       - Is at least 8 characters long
       - Contains at least one uppercase letter
       - Contains at least one lowercase letter
       - Contains at least one numeric digit
       - Contains at least one of these "special symbols":  ! @ # $ % ^ & * ?
       Must satisfy ALL FIVE categories for password to be "secure"
       Return false if any of the above security requirements are not fulfilled.
    */
    public boolean isSecure()
    {
        boolean secure = false;
        if (true) {
            secure = true;
        }
        return secure;
    }

    /* Returns a String that contains information about the security status of the
       current password.

       If isSecure() is true, this method returns "Password is secure"
       If isSecure() is false, this methods should return a single String that informs the
       user of which security requirements are not currently being met.

       For example, the password 3WrT6tH does not meet length or special symbol
       requirements, so this method should return the following String (using a line
       break \n):

       "The password must be at least 8 characters
        The password must contain a special symbol: ! @ # $ % ^ & * ?"
    */
    public String status()
    {
        String missing = "";
        if (isLongEnough() == false) {
            missing += "The password must be at least 8 characters\n";
        }
        if (containsUppercase() == false) {
            missing += "The password must contain at least one uppercase letter\n";
        }
        if (containsLowercase() == false) {
            missing += "The password must contain at least one lowercase letter\n";
        }
        if (containsDigit() == false) {
            missing += "The password must contain at least one digit\n";
        }
        if (containsSpecialSymbol() == false) {
            missing += "The password must contain at least one special symbol:  @ # $ % ^ & * ?";
        }
        return missing;
    }


    // PRIVATE HELPER METHODS (marked "private" rather than "public")

    /* Returns true if the password’s length meets the minimum requirement of 8 characters
       and false otherwise.
     */
    private boolean isLongEnough()
    {
        boolean eight = false;
        if (password.length() >= 8){
            eight = true;
        }
        return eight;
    }

    /* Returns true if the password has at least one uppercase letter and false otherwise.
     */
    private boolean containsUppercase() {
        boolean upperCase = false;
        char letter = '1';
        for (int i = 0; i < password.length(); i++) {
            letter = password.charAt(i);
            if (Character.isUpperCase(letter)) {
                upperCase = true;
            }
        }
        return upperCase;
    }

    /* Returns true if the password has at least one lowercase letter and false otherwise.
     */
    private boolean containsLowercase()
        {
            boolean lowerCase = false;
            char letter = '1';
            for (int i = 0; i < password.length(); i++) {
                letter = password.charAt(i);
                if (Character.isLowerCase(letter)) {
                    lowerCase = true;
                }
            }
            return lowerCase;
        }

    /* Returns true if the password has at least one digit and false otherwise.
     */
    private boolean containsDigit()
    {
        boolean numericDigit = false;
        char letter = '1';
        for (int i = 0; i < password.length(); i++) {
            letter = password.charAt(i);
            if (Character.isDigit(letter)) {
                numericDigit = true;
            }
        }
        return numericDigit;

    }

    /* Returns true if the password has at least one of these special symbols:
       ! @ # $ % ^ & * ?    and false otherwise.
     */
    private boolean containsSpecialSymbol()
    {
        boolean specialSymbol = false;
        char letter = '1';
        for (int i = 0; i < password.length(); i++) {
            letter = password.charAt(i);
            int letter2 = letter;
            if (letter2 == 33 || letter2 == 35 || letter2 == 36 || letter2 == 37 || letter2 == 38 || letter2 == 42
                    || letter2 == 64 || letter2 == 94) {
                specialSymbol = true;
            }
        }
        return specialSymbol;
    }

    /* Checks a given character string to see if password contains at least one
       character from that string.

       For example, if characterString is "ABCDEFGH", and password == "jbHFmfA"
       this method will find two occurrences (F and A) and return true, since two
       is at least one
     */
    private boolean checkString(String characterString)
    {
        boolean hasString = false;
        for (int i = 0; i < characterString.length(); i++) {
            for (int i2 = 0; i < password.length(); i++) {
                if (i == i2) {
                    hasString = true;
                }
            }
        }
        return hasString;
    }
}
