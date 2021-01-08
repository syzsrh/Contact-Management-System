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
public class CheckerFacade {
    MobileNoChecker numcheck;
    EmailChecker emailcheck;
    
    public CheckerFacade(MobileNoChecker numcheck, EmailChecker emailcheck) {
        this.numcheck = numcheck;
        this.emailcheck = emailcheck;
    }
    
    public boolean CheckMobile() {
        if (numcheck.MobileNoChecker() == true) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean CheckEmail() {
        if (emailcheck.EmailChecker()== true) {
            return true;
        }
        else {
            return false;
        }
    }
}
