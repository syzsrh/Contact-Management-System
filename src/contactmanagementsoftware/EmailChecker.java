/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

/**
 *
 * @author Faiq Rusyaidie
 */
public class EmailChecker {
    public boolean EmailChecker() {
        int x;
        if (!email.contains("@")) {
            return false;
        }
        else {
        return true;
        }
    }
    
    String email;
    
    public EmailChecker(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
}
