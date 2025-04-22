package encapsulation;

/*

Create a class called PasswordManager that:

Has one private attribute: password (String).

Has a constructor that sets the password.

Has a method changePassword(String oldPassword, String newPassword) that:

Only changes the password if the oldPassword is correct and the newPassword is at least 8 characters long.

Has a method isCorrectPassword(String input) that returns true or false.

🔐 Don't allow direct access to the password at all (no getter).

 */

public class PasswordManager {

    private String password;

    PasswordManager(String password) {
        this.password = password;
    }

    private boolean isCorrectPassword(String input) {
        if (input.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (!isCorrectPassword(oldPassword)) {
            throw new IllegalArgumentException("Incorrect password entered");
        } else if (newPassword.length() < 8) {
            throw new IllegalArgumentException("Password must be 8 characters or more");
        } else {
            password = newPassword;
        }
    }
}
