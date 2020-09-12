package chapter8;

import java.util.Scanner;

public class PasswordValidator {

    private String userName;
    private String currentPassword;

    private static Scanner scanner = new Scanner(System.in);
    private boolean valid;
    private String errorMessage;

    public PasswordValidator(String _userName,String _currentPassword){
        this.userName = _userName;
        this.currentPassword = _currentPassword;
    }
    public boolean isValid(){
        return valid;
    }
    public String getErrorMessage(){
        return errorMessage;
    }
    public static void main(String[] args) {
        var validator = login();
        validator.printPasswordRules();

        do {
            var proposedPassword = validator.getProposedPassword();
            validator.validatePassword(proposedPassword);

            if(!validator.isValid()){
                System.out.println(validator.getErrorMessage());
            }
        }while(!validator.isValid());

        System.out.println("The proposed password is valid");
        scanner.close();
    }

    /**
     * Create a username and password.
     * @return return password validator object
     */
    public static PasswordValidator login(){
        System.out.println("Enter your username:");
        String _userName = scanner.nextLine();
        System.out.println("Enter your password:");
        String _currentPassword = scanner.nextLine();

        return new PasswordValidator(_userName,_currentPassword);
    }

    /**
     * Print rules for the password
     */
    public void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

    /**
     * get proposed password
     * @return return proposed password
     */
    public String getProposedPassword(){
        System.out.println("Enter your new password");
        return scanner.nextLine();
    }

    /**
     * validate proposed password.
     * @param _proposedPassword proposed password to be validated
     */
    public void validatePassword(String _proposedPassword){
        valid = true;
        errorMessage = "";
        // check is password at least 8 char
        if(_proposedPassword.length()<8){
            valid = false;
            errorMessage += "\nYour password must be at least 8 characters.";
        }
        //check is the password contain uppercase.
        if(_proposedPassword.equals(_proposedPassword.toLowerCase())){
            valid = false;
            errorMessage += "\nYour password must include an uppercase letter.";
        }
        //check for special character, true only if the password contains a-zA-Z0-9.
        if(_proposedPassword.matches("[a-zA-Z0-9 ]*")){
            valid = false;
            errorMessage += "\nYour password must include a special character.";
        }
        //check password contain username.
        if(_proposedPassword.toLowerCase().contains(userName.toLowerCase())){
            valid = false;
            errorMessage += "\nYour password must not contain your username.";
        }
        //check password is not equal current password
        if(_proposedPassword.equals(currentPassword)){
            valid = false;
            errorMessage += "\nYour password must be different from your current password.";
        }
    }
}
